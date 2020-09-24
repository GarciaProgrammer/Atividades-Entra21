package Exercicio4;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor [] = new int [20];
		Random numero = new Random ();
		Scanner teclado = new Scanner(System.in);
		int posicao = 0;
		
		
		System.out.println("Digite um Valor que deseja buscar");
		int busca = teclado.nextInt();
		
		for (int i = 0; i < vetor.length; i ++) {
			vetor[i] = i;
			System.out.print("|" + vetor[i]);
			if (vetor[i] == busca) {
				posicao = i;
			}
			}
		if (posicao > 0 ) {
		System.out.println("");
		System.out.println("Seu número esta na posição: " + (posicao + 1) );
		}
	}

}
