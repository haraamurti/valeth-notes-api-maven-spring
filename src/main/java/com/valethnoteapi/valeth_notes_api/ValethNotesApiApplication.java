package com.valethnoteapi.valeth_notes_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ValethNotesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValethNotesApiApplication.class, args);
    }

    @GetMapping
    public static void hello() {
        System.out.println("Hello maven is starting...");
        System.out.println("valeth-notes-api...");

    }

}
