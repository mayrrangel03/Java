package exercicios;

public class AplicacaoPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Mayara");
		pessoa.setIdade(18);
		System.out.println("NOME: "+ pessoa.getNome() + "  IDADE INICIAL: " + pessoa.getIdade());
		for(int Novaidade = pessoa.getIdade() + 1 ; Novaidade <100; Novaidade++) {
			System.out.println("FELIZ ANIVERSARIO!!");
			System.out.println("Nome: "+ pessoa.getNome() + " Nova idade: "+ Novaidade);
			
		}
		

	}

}
