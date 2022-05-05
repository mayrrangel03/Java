package br.com.itexto.mayaratools.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ExtratorLinks")
public class ExtratorLinks implements Processador {
	
	@Autowired
	private Consumidor consumidor;
	
	@Override
	public String processar(String url) {
		// TODO Auto-generated method stub
		return "https://news.com";
	}

}
