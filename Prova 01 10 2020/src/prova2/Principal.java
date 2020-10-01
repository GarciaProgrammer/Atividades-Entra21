package prova2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int numero = ThreadLocalRandom.current().nextInt(25, 100);
		int soma = 0;
		
		for (int i = 0; i <= numero; i ++) {
			soma += i;
		}	
		System.out.println("O valor da soma é : " + soma);
		System.out.println("O valor do número gerado é : " +numero);
	}

}
