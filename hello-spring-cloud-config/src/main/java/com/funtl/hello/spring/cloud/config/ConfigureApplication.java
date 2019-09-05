package com.funtl.hello.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author
 * @ClassName caodongjian
 * @Description TODO
 * @Date 2019/8/31 4:40 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigureApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigureApplication.class, args);
    }
}
