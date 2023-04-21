package com.example.controller_service_repository_componentscan;

import com.example.controller_service_repository_componentscan.app.AppGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GirlController {
    @Autowired
    AppGirl appGirl;

    public void test(){
        System.out.println(appGirl.toString());
    }
}
