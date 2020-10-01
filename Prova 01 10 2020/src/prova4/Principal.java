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
				System.out.println("Usuário acertou o número gerado, Parabéns");
				break;
			} else {
				System.out.println("Usuário não acertou, gostaria de tentar novamente?");

				System.out.println("\n");
				System.out.println("O Número sorteado foi         : " + numeroGerado);
				System.out.println("O número que você digitou foi : " + numeroChute);
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
						System.out.println("Opção inválida.");
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
