package atividade6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 1000;
		
		while (numero <= 1999) {
			if(numero % 11 == 5) {
				System.out.println(numero);
			}
			numero += 1;
		}
		
	}

}
