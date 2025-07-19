package com.aluracursos.desafio_spring_boot_libros;

import com.aluracursos.desafio_spring_boot_libros.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioSpringBootLibrosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringBootLibrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
