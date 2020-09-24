package Exercicio3;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = new int [16];
		int vetor2[] = new int [16];
		int vetor3[] = new int [16];
		int vetor4[] = new int [16];
		Random random = new Random ();
		int j= 8;
		int h = 0;
		
		
		for (int i = 0; i < vetor.length; i ++ ) {
			vetor[i] = random.nextInt(50);	
			System.out.print("[" + vetor[i] + "]");
		}
		System.out.println("");

		for (int i = 8; i < 16; i ++) {
			vetor3[i] = vetor[i];
		}
		for (int i = 0; i < 8 ; i ++) {
			vetor2[i] = vetor[i];
		}
		
		for (int i = 0; i < 8; i ++) {
			vetor4[i] = vetor3[j];
			j += 1;
		}
		for (int i = 8; i < 16; i ++) {
			vetor4[i] = vetor[h];
			h += 1;
		}
		System.out.println("vetor Completo:");
		for (int i = 0; i < vetor4.length; i ++ ) {
			vetor[i] = random.nextInt(50);	
			System.out.print("[" + vetor4[i] + "]");
		}
		
	}

}
