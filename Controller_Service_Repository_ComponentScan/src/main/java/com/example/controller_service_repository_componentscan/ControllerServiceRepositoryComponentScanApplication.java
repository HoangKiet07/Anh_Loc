package com.example.controller_service_repository_componentscan;

import com.example.controller_service_repository_componentscan.app.AppGirl;
import com.example.controller_service_repository_componentscan.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@ComponentScan("com.example.controller_service_repository_componentscan.others")
@SpringBootApplication
public class ControllerServiceRepositoryComponentScanApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ControllerServiceRepositoryComponentScanApplication.class, args);
        GirlService girlService = context.getBean(GirlService.class);

        Girl girl = girlService.getName();
        System.out.println(girl);

        AppGirl appGirl = context.getBean(AppGirl.class);
        System.out.println(appGirl);

        OtherGirl otherGirl = context.getBean(OtherGirl.class);
        System.out.println(otherGirl);
    }
}
