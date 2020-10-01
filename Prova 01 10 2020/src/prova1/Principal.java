package prova1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1, numero2;
		double resultado;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor do primeiro número:");
		numero1 = teclado.nextInt();

		System.out.println("Digite o valor do segundo número:");
		numero2 = teclado.nextInt();

		if (numero2 != 0) {
			resultado = numero1 / numero2;
			System.out.println("O valor da divisão é : " + resultado);
		} else {
			System.out.println("Não é possível dividir um número por Zero.");
		}
	}
}
