package br.com.itexto.mayaratools.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ExtratorTexto") // boom: criei um bean do spring conm esta anotação
public class ExtratorTexto implements Processador {

	@Autowired // injeção de dependência
	private Consumidor consumidor;
	
	@Override
	public String processar(String url) {
		
		try {
			String conteudo = this.consumidor.ler(url);
			return conteudo;
		} catch (IOException ex) {
			return null;
		}
		
		
	}

}
