package com.example.autowierd_component_primary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowierdComponentPrimaryApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AutowierdComponentPrimaryApplication.class, args);
        Girl girl = context.getBean(Girl.class);

        girl.outfit.wear();
    }

}
