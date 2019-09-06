package com.funtl.hello.spring.cloud.service.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author
 * @ClassName caodongjian
 * @Description TODO
 * @Date 2019/8/31 2:00 下午
 * @Version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@RestController
public class ServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class, args);
    }

    @Value("${spring.application.name}")
    String name;

    @RequestMapping(value = "/hello")
    public String hello(){
        return name;
    }
}
