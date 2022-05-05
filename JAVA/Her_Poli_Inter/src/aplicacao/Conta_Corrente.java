package aplicacao;

public class Conta_Corrente {

	public static void main(String[] args) {
		Conta_Corrente conta = new Conta_Corrente();
        conta.depositar(1000);
        conta.sacar(20);
        conta.saldomostrar();
	}

	public double saldo;
	
	public void depositar(double quantia) {
		System.out.println("Digite a quantidade a ser depositada");
		quantia = MyIO.readDouble();
        saldo =+ quantia;
	}
	
	public void sacar(double quantia) {
		System.out.println("Digite a quantidade a ser sacada");
		quantia = MyIO.readDouble();
	    saldo = saldo - (1.05*quantia);
	}
	
	public void saldomostrar () {
		System.out.println("Saldo total: "+ saldo);
	}


}
