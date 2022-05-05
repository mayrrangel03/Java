package Banco;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.setNome("Mayara");
		funcionario1.setDepartamento("TI");
		funcionario1.setSalario(1000.0);
		funcionario1.setDataentrada("21/03/2022");
		funcionario1.setCPF("14678240624");
		System.out.println("Nome: " + funcionario1.getNome());
		System.out.println("Departamento: " + funcionario1.getDepartamento());
		System.out.println("Salario: " + funcionario1.getSalario());
		System.out.println("Data de entrada no banco : " + funcionario1.getDataentrada());
		System.out.println("CPF: " + funcionario1.getCPF());
		System.out.println("Aumento salarial: " + funcionario1.recebeAumento(300));
		System.out.println("Salario por ano: " + funcionario1.calculaGanhoAnual());
		
		funcionario2.setNome("Camila");
		System.out.println("Nome: " + funcionario2.getNome());
		funcionario2.setCPF("14678240624");
		System.out.println("CPF: " + funcionario2.getCPF());
		if (funcionario1.getCPF() == funcionario2.getCPF()) {
			System.out.println("ERRO !!! CPF IGUAIS");
		} else {
			System.out.println("DIFERENTES");
		}
	}

}
