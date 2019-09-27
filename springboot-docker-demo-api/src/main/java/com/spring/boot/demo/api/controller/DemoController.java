package com.spring.boot.demo.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类DemoController的实现描述: DemoController
 *
 * @author hongyang 2019-09-26 21:36
 */
@RestController
public class DemoController {

    @RequestMapping("/springboot/demo/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        return "Hello " + name;
    }

}
