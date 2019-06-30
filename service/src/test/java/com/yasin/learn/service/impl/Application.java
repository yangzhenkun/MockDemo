package com.yasin.learn.service.impl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: yangzhenkun
 * @create: 2019-06-25 17:19
 * @desc:
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.yasin"})
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }


}
