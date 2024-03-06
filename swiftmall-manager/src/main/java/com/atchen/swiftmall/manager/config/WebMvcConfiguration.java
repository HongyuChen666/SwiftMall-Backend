package com.atchen.swiftmall.manager.config;

import com.atchen.swiftmall.manager.interceptor.LoginAuthInterceptor;
import com.atchen.swiftmall.manager.properties.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private LoginAuthInterceptor loginAuthInterceptor;

    @Autowired
    private UserProperties userProperties;

    // Interceptor registration
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginAuthInterceptor)
//                .excludePathPatterns("/admin/system/index/login" ,
//                        "/admin/system/index/generateValidateCode")
                .excludePathPatterns(userProperties.getNoAuthUrls())
                .addPathPatterns("/**"); // all paths
    }

    // CORS
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      // Add path rules
                .allowCredentials(true)               // Allow passing cookies in cross-origin situations
                .allowedOriginPatterns("*")           // Allow rules for the origin of requests
                .allowedMethods("*")
                .allowedHeaders("*") ;                // Allow all request headers
    }
}
