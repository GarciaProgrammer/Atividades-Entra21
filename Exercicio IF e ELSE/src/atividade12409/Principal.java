package atividade12409;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double altura;
		String sexo;
		Scanner teclado = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("DIgite qual seu sexo [M/F]");
		sexo = teclado.nextLine();
		
		System.out.println("Digite a sua altura:");
		altura = teclado.nextDouble();
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Seu peso ideal é : " + df.format(72.7 * altura - 58));
		}else if (sexo.equalsIgnoreCase("f")){
			System.out.println("Seu peso ideal é : " + df.format(62.1 * altura - 44.7));
		}else {
			System.out.println("Sexo invalido");
		}
		
	}

}
