package exercicios;

public class Funcionario {

	//atributos
	      String nome;
	      
	      double salario;
	      
	      String departamento;
	      
	      String dataEntrada;
	      
	      String cpf;
	      
	      double aumento;
	      
	      public double recebeAumento() {
	    	  return this.salario = this.salario + aumento; //puxa o valor do atributo
	      }
	      
	      public double calculaGanhoAnual() {
	    	  return this.salario * 12;
	      }
	      void mostra() {
	    	  System.out.println("Funcionário = " + nome + " " + cpf);// envia os atributo dos funcionarios
	  		System.out.println("departamento = " + departamento);
	  		System.out.println("Salario com aumento = " + recebeAumento());
	  		System.out.println("Ganho anual = " + calculaGanhoAnual());
	      }
		
	}


