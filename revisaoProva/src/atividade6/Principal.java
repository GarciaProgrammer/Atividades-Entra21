package atividade6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0, voto;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Deposite seu voto:");
		voto = teclado.nextInt();
		
		while (voto != 0) {
			switch (voto) {
			case 1:	
				n1 += 1;
				break;
			case 2:
				n2 +=1;
				break;
			case 3:
				n3 +=1;
				break;
			case 4:
				n4 += 1;
				break;
			case 5:
				n5 += 1;
				break;
			case 6:
				n6 += 1;
				break;

			default:
				System.out.println("Opção Invalida!");
				break;
			}
			System.out.println("deposite seu voto!");
			voto = teclado.nextInt();
		}
		System.out.println("A quantidade de votos no candidato 1 foi:" + n1);
		System.out.println("A quantidade de votos no candidato 2 foi:" + n2);
		System.out.println("A quantidade de votos no candidato 3 foi:" + n3);
		System.out.println("A quantidade de votos no candidato 3 foi:" + n4);
		System.out.println("A quantidade de votos nulos foram:" + n5);
		System.out.println("A quantidade de votos em branco foram:" + n6);
		
	}

}
