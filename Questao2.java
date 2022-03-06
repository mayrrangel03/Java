package desafio;
import java.util.Scanner;
/*Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos 
 * pares do vetor que tem uma diferença igual ao valor de x.*/
public class Questao2 {

	public static void main(String[] args) {
		int valor1;
		int valor2;
		int contador = 0;
		System.out.println("Digite o tamanho do vetor: ");
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
		int [] vetor = new int [n];
		System.out.println("Digite o valor de x: ");
        Scanner entra = new Scanner( System.in );
        int x = entra.nextInt();
        for (int i=0;i < n;i++) {
        	System.out.println("Digite um número até "+ n+ ":");
            Scanner vn = new Scanner( System.in );
            int numvetor = vn.nextInt();
            vetor [i]= numvetor;
            
        }
        int i = 0;
        for (i=0;i < n;i++) {
        	 valor1 = vetor[i];
        	for (i=1;i<n-1;i++) {
        		 valor2 = vetor[i];
        		 if (valor1 - valor2 == x | valor2-valor1 ==x) {
        			 contador++;
        		 
        	}
        }
        System.out.println("CONTADOR:"+ contador);
        

	}

}
}
