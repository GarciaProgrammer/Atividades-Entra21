package atividade1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fruta;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*--------------------*");
		System.out.println("Digite uma fruta que deseja comprar:");
		fruta = teclado.nextLine();
		
		switch (fruta) {
		case "Maça" :
			System.out.println("Não vendemos esta fruta aqui");
			break;

		case "Kiwi"	:
			System.out.println("Estamos com escacez de kiwi.");
			break;
			
		case "Melancia" :
			System.out.println("Aqui está, s]ao 3 reais o kilo");
			break;
			
		default:
			System.out.println("Produto não encontrado");
			break;
			
		}
	}

}
