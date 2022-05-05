package Funcionarios;

public abstract class Employee {
	
    private String name;
    private int cpf;
    private double salary;
    private double hours;
    private double venda;
    
    public abstract void Salary();
	
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

}
