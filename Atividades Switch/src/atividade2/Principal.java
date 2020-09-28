package atividade2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String carro;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite qual tipo de veiculo deseja comprar:");
		carro = teclado.nextLine();
		
		switch (carro.toLowerCase()) {
		case "hatch" :
			System.out.println("Compra efetuada com sucesso");
			break;
		case "sedan" :
			System.out.println("Tem certeza que não prefere outro modelo?");
			break;
			
		case "motocicleta":
			System.out.println("Tem certeza que não prefere outro modelo?");
			break;
		case "c]aminhonete":
			System.out.println("Tem certeza que não prefere outro modelo?");
			break;
			
		default:
			System.out.println("Modelo Indisponivel");
			break;
		}
	}

}
