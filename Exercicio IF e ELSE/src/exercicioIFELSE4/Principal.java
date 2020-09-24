package exercicioIFELSE4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("*----------------------------*");
		System.out.println("     001 -------- Feijão");
		System.out.println("     002 -------- Arroz");
		System.out.println("*----------------------------*");
		System.out.println("Escolha o produto que você deseja:");

		int escolha = teclado.nextInt();
		switch (escolha) {
		case 001:
			System.out.println("VocÊ selecionou Feijão");
			break;

		case 002:
			System.out.println("Você selecionou Arroz");
			break;

		default:
			System.out.println("Opção invalida");
			break;
		}
	}

}
