package atividade5;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codigoAluno, nota1, nota2, nota3, qtd = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do ALuno");
		codigoAluno = teclado.nextInt();
		while (codigoAluno != 0) {
			System.out.println("Digite sua primeira nota:");
			nota1 = teclado.nextInt();
			
			System.out.println("Digite sua segunda nota:");
			nota2 = teclado.nextInt();
			
			System.out.println("Digite sua terceira nota:");
			nota3 = teclado.nextInt();
			
			media = (nota1 + nota2 + nota3) / 3;
			System.out.println("a M�dia do aluno � : " + media);
			
			System.out.println("Digite o c�digo do proximo aluno:");
			codigoAluno = teclado.nextInt();
		}
		System.out.println("Aluno n�o encontrado, o sistema ser� encerrado!");
	}

}
