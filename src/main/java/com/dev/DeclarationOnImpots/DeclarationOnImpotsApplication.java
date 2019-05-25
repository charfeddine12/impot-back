package com.dev.DeclarationOnImpots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.dev.DeclarationOnImpots.Repository")

public class DeclarationOnImpotsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeclarationOnImpotsApplication.class, args);
	}

}
