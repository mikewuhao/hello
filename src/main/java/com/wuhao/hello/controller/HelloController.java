package com.wuhao.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhao
 * @description
 * @date 2021-11-09 11:28
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    public String say() {
        return "Hello World";
    }

}