package atividade4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0, qtd = 0, soma = 0;
		float media = 0;
		boolean aux = true;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do numero:");
		numero = teclado.nextInt();
		while (numero > 0) {
			soma += numero;
			qtd ++;
			System.out.println("Digite o valor do numero:");
			numero = teclado.nextInt();
		}
		media = soma / qtd;
		System.out.println(media);
		System.out.println(qtd);
		System.out.println(soma);
	}

}
