package br.com.itexto.mayaratools.services;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.springframework.stereotype.Component;

/**
 * Responsável por receber uma URL e me retornar o texto contido
 * nesta URL
 * @author mayara
 *
 */
@Component
public class Consumidor {
	
	public String ler(String endereco) throws IOException {
		StringBuilder builder = new StringBuilder();
		
		URL url = new URL(endereco);
		InputStream input = url.openConnection().getInputStream();
		byte[] buffer = new byte[256];
		int c = -1;
		while ((c = input.read(buffer)) != -1) {
			builder.append(new String(buffer, 0, c));
		}
		
		return builder.toString();
	}

}
