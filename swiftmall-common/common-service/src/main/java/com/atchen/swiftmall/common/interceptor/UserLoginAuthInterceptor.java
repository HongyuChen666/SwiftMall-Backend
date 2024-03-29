package com.atchen.swiftmall.common.interceptor;

import com.alibaba.fastjson2.JSON;
import com.atchen.swiftmall.model.entity.user.UserInfo;
import com.atchen.swiftmall.utils.AuthContextUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

public class UserLoginAuthInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        String token = request.getHeader("token");
        String userJson = redisTemplate.opsForValue().get("user:swiftmall:" + token);

        // ThreadLocal
        AuthContextUtil.setUserInfo(JSON.parseObject(userJson, UserInfo.class));

        return true;
    }

}
