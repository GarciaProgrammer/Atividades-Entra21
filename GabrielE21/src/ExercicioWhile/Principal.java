package ExercicioWhile;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0;
		while (numero <= 100) {
			if (numero % 2 != 0) {
				System.out.print("|" + numero);
			}
			numero += 1;
		}
	}

}
