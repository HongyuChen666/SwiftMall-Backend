package com.atchen.swiftmall.user.service.impl;

import com.atchen.swiftmall.user.service.SmsService;
import com.atchen.swiftmall.utils.HttpUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class SmsServiceImpl implements SmsService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public void sendCode(String phone) {

        // For own test, I already set a fixed key-value in Redis
        String code = redisTemplate.opsForValue().get(phone);
        if (StringUtils.hasText(code)) {
            return;
        }

        // generate a verification code
        code = RandomStringUtils.randomNumeric(4);

        // Put the verification code into Redis
        redisTemplate.opsForValue().set(phone,code,5, TimeUnit.MINUTES);

        // Send the verification code to the phone number
        sendMessage(phone,code);
    }

    // Send verification code
    private void sendMessage(String phone, String code) {
        String host = "https://dfsns.market.alicloudapi.com";
        String path = "/data/send_sms";
        String method = "POST";
        String appcode = "c5dba84b5d824f809f0e7efadbe4b2c4";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        bodys.put("content", "code:"+code);
        bodys.put("template_id", "CST_ptdie100");
        bodys.put("phone_number", phone);

        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
