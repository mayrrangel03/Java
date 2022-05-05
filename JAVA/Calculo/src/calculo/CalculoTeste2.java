package calculo;

public class CalculoTeste2 {

	public static void main(String[] args) {
		MyIO.println("DIGITE O VALOR A:");
        double a = MyIO.readDouble();
        MyIO.println("DIGITE O VALOR B:");
         double b = MyIO.readDouble();
         
		Calculo soma = (x,y) -> { //assume o valor de a e b  LAMBDA FUNÇÃO SOMA DENTRO DA FUNÇÃO MAIN
			return x/y; // define a implementaco de interface dentro do lambda em tempo de execução
		};
		MyIO.println(soma.executar(a,b));
	}

}
