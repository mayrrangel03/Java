package Funcionarios;

public class EmployeeTest {
	public static void main(String[] args) {
		SalariedEmployee funcionarionormal = new SalariedEmployee();
		CommisionEmployee funcionarioComissão = new CommisionEmployee();
        HourlyEmployee funchoras = new HourlyEmployee();
		System.out.println("DIGITE O NOME do funcionario normal:");
		funcionarionormal.setName(MyIO.readLine());
		System.out.println("DIGITE O NOME do funcionario por comissão:");
		funcionarioComissão.setName(MyIO.readLine());
		System.out.println("DIGITE O NOME do funcionario por horas:");
		funchoras.setName(MyIO.readLine());
		System.out.println("DIGITE O CPF de cada um em ordem");
		funcionarionormal.setCpf(MyIO.readInt());
		funcionarioComissão.setCpf(MyIO.readInt());
		funchoras.setCpf(MyIO.readInt());
		System.out.println("DIGITE O NUMERO DE HORAS do funcionario por horas");
		funchoras.setHours(MyIO.readDouble());
		System.out.println("DIGITE O VALOR TOTAL EM REAIS DAS VENDAS pelo comissionado");
		funcionarioComissão.setVenda(MyIO.readDouble());
		
		MyIO.println("NOME DO FUNCIONARIO ASSALARIADO: "+ funcionarionormal.getName());
		MyIO.println("NOME DO FUNCIONARIO POR HORA: "+ funchoras.getName());
		MyIO.println("NOME DO FUNCIONARIO POR COMISSAO: "+ funcionarioComissão.getName());
		MyIO.println("CPF: "+ funcionarioComissão.getCpf());
		MyIO.println("CPF: "+ funcionarionormal.getCpf());
		MyIO.println("CPF: "+ funchoras.getCpf());
		funcionarioComissão.Salary();
		funcionarionormal.Salary();
		funchoras.Salary();
		MyIO.println("SALARIO: "+ funcionarioComissão.getSalary());
		MyIO.println("SALARIO: "+ funcionarionormal.getSalary());
		MyIO.println("SALARIO: "+ funchoras.getSalary());
		
	}

}
