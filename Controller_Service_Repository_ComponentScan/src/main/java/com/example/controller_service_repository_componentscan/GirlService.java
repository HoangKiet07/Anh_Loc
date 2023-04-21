package com.example.controller_service_repository_componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public Girl getName(){
        String name = "Kiet";
        return girlRepository.getByName(name);
    }
}
