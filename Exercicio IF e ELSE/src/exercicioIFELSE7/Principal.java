package exercicioIFELSE7;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quantidade;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a quantidade desejada");
		quantidade = teclado.nextInt();

		if ( quantidade < 12 ) {
			System.out.println("VocÍ pagar· no total R$: " + quantidade * 0.30);
		}else if (quantidade > 12) {
			System.out.println("Voc  pagar· no total: " + quantidade * 0.25);
			
		}
	}

}

