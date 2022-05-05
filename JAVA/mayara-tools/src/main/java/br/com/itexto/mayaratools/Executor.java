package br.com.itexto.mayaratools;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import br.com.itexto.mayaratools.services.Processador;

@Component
public class Executor implements ApplicationContextAware {
	
	@Value("${endereco}")
	private String endereco;
	
	@Value("${acao}")
	private String acao;
	
	private ApplicationContext context;
	
	@PostConstruct // pós construção (após injeção de dependências)
	public void init() {
		Processador processador = this.context.getBean(acao, Processador.class);
		System.out.println(processador.processar(endereco));
	}
	
	/*
	 * Obtenho acesso ao container do Spring
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context = applicationContext;
	}

}
