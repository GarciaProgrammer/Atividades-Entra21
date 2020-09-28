package atividade5;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int numero, sorteador, resultado;

		System.out.println("Digite um valor de 1 à 20:");
		numero = teclado.nextInt();
		sorteador = random.nextInt(20);
		resultado = numero + sorteador;

		switch (resultado) {
		case 7:
			System.out.println("conseguiste 10 pontos.");
			break;
		case 14:
			System.out.println("Conseguiste 20 pontos.");
			break;
		case 21:
			System.out.println("Conseguiste 30 pontos");
			break;
		}
		if (resultado < 7) {
			System.out.println("COnseguiste 1 ponto");
		} else if (resultado > 7 && resultado < 21) {
			System.out.println("Conseguiste 5 pontos");
		} else if (resultado > 21) {
			System.out.println("Conseguiste 6 pontos");
		}
		System.out.println("Valor apostado :" + numero);
		System.out.println("O numero sorteado foi: " + sorteador);
		System.out.println("Valor do resultado: " + resultado);
	}
}
