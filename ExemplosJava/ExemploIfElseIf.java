package exemplos;

import java.util.Scanner;

public class ExemploIfElseIf {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int idade = leia.nextInt();
		
		if (idade<10) {
			
			System.out.println("N�o pode votar");
						
		} else if (idade<18){
			
			System.out.println("Voto opcional.");
		}else {
			System.out.println("Voto obrigat�rio.");
		}
		leia.close();
	}

}
