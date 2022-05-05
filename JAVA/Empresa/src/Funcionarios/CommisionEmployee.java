package Funcionarios;

public class CommisionEmployee extends Employee{
	
	public void Salary () {
		double comissionado = 1000*(0.3*this.getVenda());
		this.setSalary(comissionado);
    }
	

}
