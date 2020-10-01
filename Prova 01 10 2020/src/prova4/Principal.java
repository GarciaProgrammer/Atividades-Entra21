package prova4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		Random random = new Random();
		Scanner teclado = new Scanner(System.in);

		int numeroChute, aux;
		boolean continuar = true;

		while (continuar == true) {
			int numeroGerado = random.nextInt(15);
			System.out.println("Digte um valor entre 1 a 15:");
			numeroChute = teclado.nextInt();

			if (numeroGerado == numeroChute) {
				System.out.println("Usu�rio acertou o n�mero gerado, Parab�ns");
				break;
			} else {
				System.out.println("Usu�rio n�o acertou, gostaria de tentar novamente?");

				System.out.println("\n");
				System.out.println("O N�mero sorteado foi         : " + numeroGerado);
				System.out.println("O n�mero que voc� digitou foi : " + numeroChute);
				System.out.println("\n");
				System.out.println("*-----------------------*");
				System.out.println(" 1 - Tentar Novamente");
				System.out.println(" 0 - Sair");
				aux = teclado.nextInt();
				switch (aux) {
				case 1:
					continuar = true;
					break;
				case 0:
					System.out.println("Saindo do sistema...");
					continuar = false;
					break;

				default:
					while (aux != 0 || aux != 1) {
						System.out.println("Op��o inv�lida.");
						System.out.println(" 1 - Tentar Novamente");
						System.out.println(" 0 - Sair");
						aux = teclado.nextInt();
						if (aux == 1) {
							break;
						}else if (aux == 0) {
							System.out.println("Saindo do Sistema...");
							continuar = false;
							break;
						}
					}
					break;

				}
			}
		}
	}
}
