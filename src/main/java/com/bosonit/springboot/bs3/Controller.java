package com.bosonit.springboot.bs3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Clase2 clase2;

    @Autowired
    Clase1 clase1;
}