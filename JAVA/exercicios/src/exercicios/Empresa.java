package exercicios;

public class Empresa{
	
	String[] nomesfunc;
	String nome;
	String cnpj;
	
	void adiciona(Funcionario funcionario) {
		for(int i = 0; i< 10; i++) {
		this.nomesfunc[i] = funcionario.nome;
		}
	}
	
}
