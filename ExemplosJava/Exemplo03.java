package exemplos;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[]args) {
		 
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		int numero1 = leitor.nextInt();
		System.out.println("Digite um n�mero:");
		int numero2 = leitor.nextInt();
		int multiplicacao = numero1 * numero2;
		System.out.print("O resultado dessa multiplica��o � igual �: " + multiplicacao);
		
		leitor.close();
		
	}
	
	
	
	
}
