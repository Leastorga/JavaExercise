package faccat;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o custo de fábrica.");
		double custo = leia.nextDouble();
		double custoFinal = custo + (custo * 28 / 100) + (custo * 45 / 100);
		System.out.println("O custo final ao consumidor é igual à: " + custoFinal + "R$");
		
		leia.close();
	}
}
