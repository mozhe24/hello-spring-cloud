package com.funtl.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author
 * @ClassName caodongjian
 * @Description TODO
 * @Date 2019/8/31 2:08 下午
 * @Version 1.0
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi your message is : %s, port : %s", message, port);

    }
}
