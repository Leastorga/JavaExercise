package faccat;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ano_nascimento, ano_atual, idade;
		System.out.println("Digite o ano atual:");
		ano_atual= leia.nextInt();
		
		System.out.println("Digite o ano que voc� nasceu:");
		ano_nascimento = leia.nextInt();
		
		idade = ano_atual - ano_nascimento;
		
		if (idade >= 16) {
			
			System.out.println("Voc� j� pode votar esse ano.");
			
		} else {
			
			System.out.println("Voc� n�o pode votar ainda.");

		}
		
		leia.close();
	}

}
