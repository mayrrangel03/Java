package Banco;

public class Empresa {
    private String nome;
    private String cnpj;
    Funcionario[] empregados;
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void Adiciona(Funcionario funcionario) {
    	for(int i = 0; i < empregados.length;i++) {
    		empregados[i] = funcionario;
    	}
    	
    	
    }
}
