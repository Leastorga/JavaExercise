package faccat;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int numero01 = leitor.nextInt();
		int antecessor = numero01 - 1;
		System.out.print("O antecessor � igual �: " + antecessor);
		
		leitor.close();
	}

}
