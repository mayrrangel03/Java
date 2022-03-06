package desafio;
import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		System.out.println("Digite uma frase: ");
        Scanner in = new Scanner( System.in );
        String frase = in.nextLine();
        String result = frase.replaceAll(" ","");  
        System.out.println(result); 
        
        int tamanho = result.length();
        System.out.println(tamanho);
        double raiz = Math.sqrt(tamanho);
        
        System.out.println(raiz);
        int intraiz = (int) Math.round(raiz);
        System.out.println(intraiz);
        
        char [] matriz = new char [intraiz];
        

	}

}
