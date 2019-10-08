package com.spring.boot.demo.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/springboot/demo/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        return "Hello " + name + " v2\n";
    }

    @RequestMapping("/productpage")
    public String productpage() {
        return "Hello productpage\n";
    }

    @RequestMapping("/integrationTest")
    public String integrationTest() {
        logger.info("Hello integrationTest v2");
        return "Hello integrationTest v2\n";
    }

}
