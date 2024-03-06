package com.atchen.swiftmall.manager;


import com.atchen.swiftmall.manager.properties.MinioProperties;
import com.atchen.swiftmall.manager.properties.UserProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@ComponentScan(basePackages = {"com.atchen.gomall"})
@EnableConfigurationProperties(value = {UserProperties.class, MinioProperties.class})
@EnableScheduling
public class ManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class, args);
    }

}
