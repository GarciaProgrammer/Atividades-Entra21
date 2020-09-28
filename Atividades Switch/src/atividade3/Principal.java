package atividade3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aux, numero1, numero2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Somar ---- 1");
		System.out.println("Subtrair ---- 1");
		System.out.println("Multiplicar ---- 1");
		System.out.println("Divir ---- 1");
		System.out.println("Você Deseja Realizar qual operação: ");
		aux = teclado.nextInt();

		System.out.println("Digite o valor do numero 1:");
		numero1 = teclado.nextInt();
		System.out.println("Digite o valor do numero 2: ");
		numero2 = teclado.nextInt();

		switch (aux) {
		case 1:
			System.out.println("O resultado é: " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("O resultado é: " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("O resultado é: " + numero1 * numero2);
			break;
		case 4:
			System.out.println("O resultado é: " + numero1 / numero2);
			break;
		default:
			System.out.println("Opção invalida");
			break;

		}

	}

}
