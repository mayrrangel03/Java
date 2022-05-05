package calculo;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo multiplicacao = new Multiplicacao();
        Calculo soma = new Soma();
        MyIO.println("DIGITE O VALOR A:");
        double a = MyIO.readDouble();
        MyIO.println("DIGITE O VALOR B:");
         double b = MyIO.readDouble();
         
         MyIO.println(multiplicacao.executar(a,b));
         MyIO.println(soma.executar(a,b));
	}

}
