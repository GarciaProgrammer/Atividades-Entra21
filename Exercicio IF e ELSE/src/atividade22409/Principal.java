package atividade22409;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		int quantidade, lado1, lado2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a quantidade de lado possui o seu pol�gono");
		quantidade = teclado.nextInt();

		if (quantidade < 3) {
			System.out.println("N�o � pol�gono");
		}
		if (quantidade == 3) {
			System.out.println("Triangulo!");
			System.out.println("Digite a altura do triangulo:");
			lado1 = teclado.nextInt();
			System.out.println("Digite o tamanho da base do triangulo:");
			lado2 = teclado.nextInt();
			area = (lado1 * lado2) / 2;
			System.out.println("A �rea �: " + area);
		}

		if (quantidade == 4) {
			System.out.println("Quadrado!");
			System.out.println("Digite o tamanho do lado1:");
			lado1 = teclado.nextInt();
			System.out.println("Digite o tamanho do lado2:");
			lado2 = teclado.nextInt();
			area = lado1 * lado2;
			System.out.println("A �rea � :" + area);
		}
		if (quantidade == 5) {
			System.out.println("Pent�gono");
		}
		if (quantidade > 5 ) {
			System.out.println("Pol�gono n�o encontrado!");
		}
	}

}
