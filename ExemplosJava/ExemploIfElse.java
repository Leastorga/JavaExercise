package exemplos;

import java.util.Scanner;

public class ExemploIfElse {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		
		int idade = leia.nextInt();
		
		if(idade>16) {
			System.out.println("Eleitor pode votar.");
		}
		else {
			System.out.println("Eleitor não pode voltar.");
		}
		
		leia.close();
		
	}
}
