package exemplos;

import java.util.Scanner;

public class Exemplo04 {
	
	public static void main (String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número:");
		
		float numero01 = leitor.nextFloat();
		System.out.println("Digite um número:");
		float numero02 = leitor.nextFloat();
		float divisor = numero01 / numero02;
		System.out.printf("A divisão desses número é igual à: " + divisor);
		
		
		leitor.close();
	}
	

}