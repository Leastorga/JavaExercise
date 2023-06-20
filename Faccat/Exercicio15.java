package faccat;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		if (numero<0) {
			System.out.println("Esse número é negativo.");
		} else {
			System.out.println("Esse número é positivo.");
		}
		
	leia.close();	
	}

}
