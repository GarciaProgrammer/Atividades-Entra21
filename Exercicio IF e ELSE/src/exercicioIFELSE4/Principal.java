package exercicioIFELSE4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("*----------------------------*");
		System.out.println("     001 -------- Feij�o");
		System.out.println("     002 -------- Arroz");
		System.out.println("*----------------------------*");
		System.out.println("Escolha o produto que voc� deseja:");

		int escolha = teclado.nextInt();
		switch (escolha) {
		case 001:
			System.out.println("Voc� selecionou Feij�o");
			break;

		case 002:
			System.out.println("Voc� selecionou Arroz");
			break;

		default:
			System.out.println("Op��o invalida");
			break;
		}
	}

}
