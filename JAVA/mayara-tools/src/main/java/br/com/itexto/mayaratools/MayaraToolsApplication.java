package br.com.itexto.mayaratools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MayaraToolsApplication {

	public static void main(String[] args) {
		System.setProperty("ACAO", args[0]);
		System.setProperty("ENDERECO", args[1]);
		SpringApplication.run(MayaraToolsApplication.class, args);
	}

}
