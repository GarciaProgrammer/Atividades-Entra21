package atividade3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int numero, inicializador = 1;
		
		System.out.println("Digite um valor para ele finalizar:");
		numero = teclado.nextInt();
		
		while (inicializador <= numero) {
			System.out.print("[" + inicializador + "]");
			inicializador ++;
		}
	}

}
