package exercicioIFELSE3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um valor para verificar se ele � impar:");
		int valor = teclado.nextInt();
		
		if ( valor % 2 == 1 ) {
			System.out.println("� impar");
		}else {
			System.out.println("� par");
		}
	}

}
