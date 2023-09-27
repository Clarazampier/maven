package com.example.maven_praticando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MavenPraticandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenPraticandoApplication.class, args);
	}

	@GetMapping("/")
	public String deucerto(){
		return "Nikinho + Jhonatas + Gois + Ana + Beatriz + Helena = Germinare Tech" ;
	}

}
