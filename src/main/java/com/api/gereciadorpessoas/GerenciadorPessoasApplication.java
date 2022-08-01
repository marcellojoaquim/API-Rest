package com.api.gereciadorpessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPessoasApplication {

	public static void main(String[] args) {

// validar de forma amigável o starter da aplicação no console
		int num =10;
		boolean test;

		if(num >= 0){
			test = true;
		}else{
			test = false;
		}
		SpringApplication.run(GerenciadorPessoasApplication.class, args);
		System.out.println(test);
	}

}
