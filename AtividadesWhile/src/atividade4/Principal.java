package atividade4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quantidadeALuno, nota1, nota2, contador = 1;
		float media = 0;
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Digite a quantidade de alunos:");
		quantidadeALuno = teclado.nextInt();
		
		while (contador <= quantidadeALuno) {
			System.out.println("digite sua primeira nota:");
			nota1 = teclado.nextInt();
			System.out.println("digite sua segunda nota:");
			nota2 = teclado.nextInt();
			
			media += (nota1 + nota2) / 2;
			contador ++;
		}
		media = media / quantidadeALuno;
		System.out.println("A media da turma é " + media);
	}
}
