package com.bosonit.springboot.bs3;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Clase1 {
    @PostConstruct
    public void ejecutar() {
        System.out.println("Hola desde clase inicial");
    }
}