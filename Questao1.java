package desafio;
/*A mediana de uma lista de n�meros � basicamente o elemento que se encontra no meio da lista ap�s a ordena��o. 
 * Dada uma lista de n�meros com um n�mero �mpar de elementos,desenvolva um algoritmo que encontre a mediana.*/

import java.util.Scanner;
import java.util.Arrays;
public class Questao1 {

	public static void main(String[] args) {
		System.out.println("ESTE VETOR TER� 5 ELEMENTOS");
		System.out.println(" ");
		
		int [] vetor = new int [6];
		for (int i =0; i < 6; i++) {
		System.out.println("Digite um n�mero at� 100 para colocar no vetor: ");
        Scanner in = new Scanner( System.in );
        int numero = in.nextInt();
        System.out.println(in.nextLine());
        vetor [i] = numero;
		}
		System.out.println("VETOR SEM ESTAR ORGANIZADO:");
		for (int i =0;i <5; i++) {
			System.out.println(vetor[i]);
		}
		
		
		
		Arrays.sort(vetor);
		System.out.println("VETOR ORGANIZADO:");
		for (int i =0;i <5; i++) {
			System.out.println(vetor[i]);
		}
		int i = 2;
		System.out.println("A MEDIANA DO VETOR �: "+ vetor[i]);

	}

}
