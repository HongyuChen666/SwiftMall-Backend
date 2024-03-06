package com.atchen.swiftmall.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Knife4jConfig {

    @Bean
    public GroupedOpenApi userApi() {      // Created a group for an API interface
        return GroupedOpenApi.builder()
                .group("user-api")         // Group name
                .pathsToMatch("/api/**")  // API request path rule
                .build();
    }

    @Bean
    public GroupedOpenApi adminApi() {      // Created a group for an API interface
        return GroupedOpenApi.builder()
                .group("admin-api")         // Group name
                .pathsToMatch("/admin/**")  // API request path rule
                .build();
    }


    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Swiftmall API documentation")
                        .version("1.0")
                        .description("Swiftmall API documentation")
                        .contact(new Contact().name("atchen"))); // author
    }
}
