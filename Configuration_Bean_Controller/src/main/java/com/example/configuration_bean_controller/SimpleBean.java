package com.example.configuration_bean_controller;

public class SimpleBean {
    private String name;

    public SimpleBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "this is a simple bean, name: " + name;
    }
}
