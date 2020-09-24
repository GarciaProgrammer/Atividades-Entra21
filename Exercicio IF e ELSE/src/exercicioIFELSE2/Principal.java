package exercicioIFELSE2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor [] = new int [4];
		Scanner teclado = new Scanner (System.in);
		int menor = 9999;
		
		for (int i = 0; i < vetor.length; i ++) {
			System.out.println("Digite um numero:");
			vetor[i] = teclado.nextInt();
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("O menor valor é " + menor);
	}

}
