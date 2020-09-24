package Exercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = new int[10];
		int j = 1;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = j;
			j += 2;
			System.out.print("[" + vetor[i] + "]");
		}

	}

}
