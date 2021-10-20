package com.bosonit.springboot.bs3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Bs3Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs3Application.class, args);
	}

	@Value("#{'${argumentos}'.split(',')}")
	List<String> argumentos;

	@Bean
	Clase3 clase3(){
		return new Clase3(argumentos);
	}

}
