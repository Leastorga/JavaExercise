package faccat;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite a primeira nota:");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if (media<6) {
			System.out.printf("Aluno foi reprovado com a media de: %.2f.", media);
		} else {
			System.out.printf("Aluno foi aprovado com a média de: %.2f.", media );
		}
		leia.close();
	}

}
