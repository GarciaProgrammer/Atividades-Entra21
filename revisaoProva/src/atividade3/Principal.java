package atividade3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha a ordem que deseja aparecer os números:");
		n = teclado.nextInt();

		System.out.println("Digite o primeiro valor:");
		a = teclado.nextInt();

		System.out.println("Digite o segundo valor:");
		b = teclado.nextInt();

		System.out.println("Digite o terceiro valor:");
		c = teclado.nextInt();

		switch (n) {
		case 2:
			if (a > b && b > c) {
				System.out.println(a + " " + b + " " + c);
			} else if (a > b && c > b) {
				System.out.println(a + " " + c + " " + b);
			} else if (c > b && b > a) {
				System.out.println(c + " " + b + " " + a);
			} else if (c > a && a > b) {
				System.out.println(c + " " + a + " " + b);
			} else if (b > a && a > c) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(b + " " + c + " " + a);
			}
			break;
		case 1:
			if (a < b && b < c) {
				System.out.println(a + " " + b + " " + c);
			} else if (a < b && c < b) {
				System.out.println(a + " " + c + " " + b);
			} else if (c < b && b < a) {
				System.out.println(c + " " + b + " " + a);
			} else if (c < a && a < b) {
				System.out.println(c + " " + a + " " + b);
			} else if (b < a && a < c) {
				System.out.println(b + " " + a + " " + c);
			} else {
				System.out.println(b + " " + c + " " + a);
			}

			break;
		case 3:
			if (a > b && a > c) {
				System.out.println(b + " " + a + " " + c);
			} else if (b > a && b > c) {
				System.out.println(a + " " + b + " " + c);
			} else {
				System.out.println(a + " " + c + " " + b);
			}

			break;

		default:
			System.out.println("Opção invalida");
			break;
		}
	}
}
