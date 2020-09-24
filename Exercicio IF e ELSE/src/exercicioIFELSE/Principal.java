package exercicioIFELSE;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int numero1, numero2;
		
		System.out.println("Digite o numero 1 :");
		numero1 = teclado.nextInt();
		
		System.out.println("Digite o numero 2 :");
		numero2 = teclado.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("Numero:" + numero1 + " é maior");
		}
		else {
			System.out.println("Numero:" + numero2 + " é maior.");
		}
	}

}
