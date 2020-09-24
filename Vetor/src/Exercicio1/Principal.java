package Exercicio1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int vetor[] =  new int [12];
		Random numero =  new Random ();
		Scanner teclado = new Scanner (System.in);
		int soma, numero1, numero2;
		
		for (int i = 0; i < vetor.length; i ++) {
			 vetor[i] = numero.nextInt(20);
			 System.out.print("[" + vetor[i] + "]");
		}
		System.out.println("");
		System.out.println("Digite o indice de um numero para somar:");
		numero1 = teclado.nextInt();
		System.out.println("");
		System.out.println("Digite o indice de mais um numero para somar:");	
		numero2 = teclado.nextInt();
		
		soma = vetor[(numero1 - 1)] + vetor[(numero2 - 1)];
		System.out.println("");
		System.out.println("Valor no indice 1: " + vetor[numero1 - 1]);
		System.out.println("Valor no indice 2: " + vetor[numero2 - 1]);
		System.out.println("A Soma é: " + soma);
	}

}
