package Nivelamento2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lado1, lado2, lado3;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do lado 1:");
		lado1 = teclado.nextInt();
		
		System.out.println("Digite o tamanho do lado 2:");
		lado2 = teclado.nextInt();
		
		System.out.println("Digite o tamanho do lado3:");
		lado3 = teclado.nextInt();
		
		if ((lado1 + lado2) < lado3) {
			System.out.println("Não é um triangulo valido");
		}else if ((lado1 + lado3) < lado2) {
			System.out.println("Não é um triangulo valido");
		}else if ((lado2 + lado3) < lado1) {
			System.out.println("Não é um triangulo valido");
		}else {
			System.out.println("é um triangulo valido");
		}
		
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("Triangulo Equilatero");
		}else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triangulo Isóceles");
		}else {
			System.out.println("Triangulo Escaleno");
		}
	}

}
