package com.funtl.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author
 * @ClassName caodongjian
 * @Description TODO
 * @Date 2019/8/31 2:00 下午
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class, args);
    }
}
