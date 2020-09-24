package exercicioIFELSE6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int senha;
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Para acessar no sistema, digite a sua senha:");
		senha = teclado.nextInt();
		
		String aux = (senha != 12345) ? "Senha inválida" : ("Autenticado!");
		System.out.println(aux);
	}

}
