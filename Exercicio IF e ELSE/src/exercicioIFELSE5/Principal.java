package exercicioIFELSE5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ano;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o ano que você nasceu:");
		ano = teclado.nextInt();
		
		if ((2020 - ano) < 18) {
			System.out.println("VocÊ não pode votar!\n Você é menor de idade.");
		}else {
			System.out.println("VocÊ pode votar!");
		}
		
		
	}

}
