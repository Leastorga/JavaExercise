package faccat;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a altura do retangulo:");
		float altura = leia.nextInt();
		System.out.println("Digite a base do retangulo:");
		float base = leia.nextInt();
		float arearetangulo = altura * base;
		System.out.printf("A �rea do retangulo � igual �: " + arearetangulo );
		leia.close();
		
		
	}

}
