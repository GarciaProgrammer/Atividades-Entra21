package vetor;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = new int[20];
		int vetor2[] = new int[20];
		Random numero = new Random();
		System.out.println("Vetores não alterados:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = numero.nextInt(20);
			vetor2[i] = vetor[i] / 2;
			switch (vetor[i]) {
			case 0:
				vetor2[i] = 0;
				break;
			case 1:
				vetor2[i] = 0;
				break;
			case 2:
				vetor2[i] = 0;
				break;
			case 3:
				vetor2[i] = 0;
				break;
			case 4:
				vetor2[i] = 0;
				break;
			default:

				break;
			}
			// if (vetor2[i] < 5) {
			// vetor2[i] = 0;
			// }
			System.out.print("[" + vetor[i] + "]");
		}
		System.out.println("");
		System.out.println("Vetores alterados:");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print("[" + vetor2[i] + "]");
		}

	}

}
