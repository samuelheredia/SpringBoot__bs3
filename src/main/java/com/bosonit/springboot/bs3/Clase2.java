package com.bosonit.springboot.bs3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Clase2 implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Hola desde clase secundaria "+args[0]);
    }
}