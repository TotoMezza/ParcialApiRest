package com.facu.apirest;

import com.facu.apirest.repositorios.AutorRepository;
import com.facu.apirest.repositorios.LocalidadRepository;
import com.facu.apirest.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApirestApplication {

	@Autowired
	LocalidadRepository localidadRepository;
	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	AutorRepository autorRepository;

	public static void main(String[] args) {

		SpringApplication.run(ApirestApplication.class, args);

		System.out.println("En Efecto, Anda la fake API");

	}

}
