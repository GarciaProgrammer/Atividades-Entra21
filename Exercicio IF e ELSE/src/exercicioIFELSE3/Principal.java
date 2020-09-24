package exercicioIFELSE3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um valor para verificar se ele é impar:");
		int valor = teclado.nextInt();
		
		if ( valor % 2 == 1 ) {
			System.out.println("é impar");
		}else {
			System.out.println("é par");
		}
	}

}
