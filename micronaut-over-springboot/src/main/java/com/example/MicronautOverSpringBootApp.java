package com.example;

import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MicronautOverSpringBootApp {

    public static void main(String... args) {
         Micronaut.run(MicronautOverSpringBootApp.class);
        //org.springframework.boot.SpringApplication.run(Application.class);
    }
}
