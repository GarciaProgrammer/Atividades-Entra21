package atividade1for;

import java.util.Random;

public class Principal {
s
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, numeroMenor = 99999, numeroMaior= 0;
		Random random = new Random();
		
		for (int i = 0; i < 50; i ++) {
			numero = random.nextInt(100);
			if (numero > numeroMaior) {
				numeroMaior = numero;
			}
			if (numero < numeroMenor) {
				numeroMenor = numero;
			}
		}
		System.out.println("O Maior numero é" + numeroMaior);
		System.out.println("O menor numero é" + numeroMenor);
	}

}
