package com.bosonit.springboot.bs3;

import java.util.List;

public class Clase3 {
    Clase3(List<String> argumentos){
        System.out.println("Soy la tercera clase");
        argumentos.forEach(
            (arg) -> {
                System.out.println("Argumento: "+arg);
            } );
    }
}