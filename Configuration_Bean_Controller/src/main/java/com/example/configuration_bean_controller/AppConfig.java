package com.example.configuration_bean_controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    SimpleBean simplrBeanConfig(){
        return new SimpleBean("Kiet");
    }
}
