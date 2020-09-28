package atividade4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tipoProduto, produto;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Produtos Não-perecíveis ---- 1"
					   + "\nFrutas                  ---- 2"
					  + "\nBebidas                 ---- 3");
		System.out.println("Digite o tipo de produtos que deseja visualizar");
	
	tipoProduto = teclado.nextInt();
	
	switch (tipoProduto) {
	case 1:
		System.out.println("Arroz, Feijão, Café, Milho");
		
		break;
	case 2:
		System.out.println("Manga, banana, abacaxi, maça, limão");
		break;
	case 3 :
		System.out.println("Leite, sucos, refrigerantes, Vodkas");
		break;
	default:
		System.out.println("Opção invalida");
		break;
	}
	}
}
