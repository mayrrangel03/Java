package aplicacao;

public class Conta_ESpecial extends Conta_Corrente {
	double saldoespecial;
        public void sacar(double quantia) {
    		System.out.println("Digite a quantidade a ser sacada");
    		quantia = MyIO.readDouble();
    	    saldoespecial = saldo - (1.01*quantia);
    	}
        public void saldomostrar () {
    		System.out.println("Saldo total cliente especial: "+ saldoespecial);
    	}
        public static void main(String[] args) {
        	Conta_ESpecial contaespecial = new Conta_ESpecial();
        	contaespecial.depositar(80000);
        	contaespecial.sacar(2000);
        	contaespecial.saldomostrar();
        }
}
