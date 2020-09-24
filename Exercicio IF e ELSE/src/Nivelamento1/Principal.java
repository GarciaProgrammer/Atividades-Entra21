package Nivelamento1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] vetor = new int [10];
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um valor:");
		int valor = teclado.nextInt();
		
		if(valor > 0) {
			System.out.println("número é positivo:" + valor);
		}else {
			System.out.println("Numero é negativo:" + valor);
		}
		
		
	}

}
