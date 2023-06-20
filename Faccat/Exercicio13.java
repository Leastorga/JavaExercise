package faccat;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double media1, media2, media3, media;
		System.out.println("Digite a primeira nota:");
		media1 = leia.nextDouble();
		System.out.println("Digite a segunda nota:");
		media2 = leia.nextDouble();
		System.out.println("Digite a terceira nota:");
		media3 = leia.nextDouble();
		media = (media1 * 2 + media2 * 3 + media3 * 5)  / 10;
		System.out.printf("A média final desse aluno é igual à: %.2f", media);
		leia.close();
	}
	
}
