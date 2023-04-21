package com.example.controller_service_repository_componentscan;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository{
    @Override
    public Girl getByName(String name) {
        return new Girl(name);
    }
}
