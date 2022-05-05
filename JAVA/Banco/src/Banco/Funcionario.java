package Banco;
public class Funcionario extends Empresa{
        private String nome;
        private String departamento;
        private double salario;
        private String dataentrada;
        private String CPF;
        
        public double recebeAumento(double aumento) {
        	return this.salario = this.salario + aumento;
        	
        }
        
        double calculaGanhoAnual() {
        	return this.salario = this.salario * 12;
        }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public String getDataentrada() {
			return dataentrada;
		}

		public void setDataentrada(String dataentrada) {
			this.dataentrada = dataentrada;
		}

		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cPF) {
			CPF = cPF;
		}
}
