package com.example.autowierd_component_primary;

import org.springframework.stereotype.Component;

@Component
public class Naked implements Outfit{
    @Override
    public void wear() {
        System.out.println("Naked");
    }
}
