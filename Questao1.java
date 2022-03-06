package desafio;
/*A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. 
 * Dada uma lista de números com um número ímpar de elementos,desenvolva um algoritmo que encontre a mediana.*/

import java.util.Scanner;
import java.util.Arrays;
public class Questao1 {

	public static void main(String[] args) {
		System.out.println("ESTE VETOR TERÁ 5 ELEMENTOS");
		System.out.println(" ");
		
		int [] vetor = new int [6];
		for (int i =0; i < 6; i++) {
		System.out.println("Digite um número até 100 para colocar no vetor: ");
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
		System.out.println("A MEDIANA DO VETOR É: "+ vetor[i]);

	}

}
