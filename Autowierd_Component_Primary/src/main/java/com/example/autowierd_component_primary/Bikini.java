package com.example.autowierd_component_primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Bikini");
    }
}
