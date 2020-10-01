package atividade2;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		teste(random);

	}

	public static void teste(Random randomnmRandom) {
		int numero, aux = 0;
		for (int i = 0; i < 51; i++) {
			numero = randomnmRandom.nextInt(100);
			if (numero % 2 == 0) {
				if (numero > aux) {
					aux = numero;
				}
			}
		}
		System.out.println("O Maior numero é :" + aux);
	}
}
