package Funcionarios;

public class HourlyEmployee extends Employee{
	
	public void Salary () {
    	double horas = this.getHours();
    	if (horas <= 40) {
    	 this.setSalary(1000.0);
    	} else if (horas > 40) {
    		double salario = 1000.0 + (horas)*1.5*1000/40;
    		this.setSalary(salario);
    	}
	    }

	
}
