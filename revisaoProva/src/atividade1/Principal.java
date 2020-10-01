package atividade1;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		Random random = new Random ();
		
		for (int i = 0; i < 51; i ++) {
			numero = random.nextInt(500);
			if (numero >= 10 && numero <= 100) {
				System.out.print
				("[" + numero + "]");
			}
		}
	}
	
	

}
