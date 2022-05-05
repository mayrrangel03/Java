package exercicios;

public class TesteFuncionario {

	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();//criar um objeto
		funcionario.nome = "Mayara";
		funcionario.cpf = "146.782.406-24";
		funcionario.departamento = "RH";
		funcionario.salario = 1000.0;
		funcionario.aumento = 500.0;
		funcionario.mostra();
	}

}
