package exercicioIFELSE8;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor de n1:");
		n1 = teclado.nextInt();

		System.out.println("Digite o valor de n2:");
		n2 = teclado.nextInt();

		System.out.println("Digite o valor de n3:");
		n3 = teclado.nextInt();

		if (n1 < n2 && n2 < n3) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		}
		if (n1 < n2 && n3 < n2) {
			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		}
		if (n2 < n1 && n1 < n3) {
			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		}
		if (n3 < n1 && n2 < n1) {
			System.out.println(n3);
			System.out.println(n1);
			System.out.println(n2);
		}
	}

}
