package prova3;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int maior = 9999999, menor = 0, numero, soma = 0;
		float media;

		for (int i = 0; i <= 500; i++) {
			numero = random.nextInt(2000);
			if (numero % 2 == 0) {
				soma += numero;
				if (numero > menor) {
					menor = numero;
				}
				if (numero < maior) {
					maior = numero;
				}
			}
		}
		media = soma / 500;
		System.out.println("O maior número gerado foi: " + maior);
		System.out.println("O menor número gerado foi: " + menor);
		System.out.println("A média dos números lidos foi " + media);

	}

}
