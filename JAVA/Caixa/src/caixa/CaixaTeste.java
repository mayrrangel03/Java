package caixa;

public class CaixaTeste {

	public static void main(String[] args) {
         Caixa<String> caixaA = new Caixa<String>();
         caixaA.setCoisa("SEGREDO!");
         System.out.print(caixaA.getCoisa());
	}

}
