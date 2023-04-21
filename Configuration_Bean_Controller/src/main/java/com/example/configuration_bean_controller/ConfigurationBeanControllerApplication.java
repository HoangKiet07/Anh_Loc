package com.example.configuration_bean_controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigurationBeanControllerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConfigurationBeanControllerApplication.class, args);

        SimpleBean simpleBean = context.getBean(SimpleBean.class);

        System.out.println("Simple Bean Examole: " + simpleBean.toString());
    }

}
