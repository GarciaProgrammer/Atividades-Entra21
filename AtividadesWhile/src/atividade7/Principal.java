package atividade7;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroChutado, numeroSorteado, quantidade = 1;
		Random random = new Random();
		Scanner teclado = new Scanner (System.in);
		
		numeroSorteado = random.nextInt(20);
		
		while (quantidade <= 3) {
			System.out.println("digite um número para tentar acertar");
			numeroChutado = teclado.nextInt();
			if(numeroChutado == numeroSorteado) {
				System.out.println("Parabéns, você acertou!!!");
				break;
			}else {
				System.out.println("Numero Incorreto!");
			}
			
			quantidade ++;
		}
		System.out.println("O numero é: " + numeroSorteado);
	}

}
