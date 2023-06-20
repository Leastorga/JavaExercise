package exemplos;

import java.util.Scanner; 

public class Exemplo02 {
	
	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero1 = leitor.nextInt();
		System.out.println("Digite um número:");
		int numero2 = leitor.nextInt();
		int soma = numero1 - numero2;
		System.out.print("A subtração desses dois números é: " + soma);
		
		leitor.close();
	}
	

}
