package com.example.simpleapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.simpleapplication", "controller"})
public class SimpleapplicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleapplicationApplication.class, args);
    }

}
