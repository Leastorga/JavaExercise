package faccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int macas;
		double valor_total;
		
		System.out.println("Quantas maças você deseja comprar?");
		macas = leia.nextInt();
		
		if (macas<12) {
			valor_total = macas * 1.30;
			System.out.printf("O valor total será: %.2f", valor_total, " R$" ); 
			
		} else {
			valor_total = macas * 1;
			System.out.printf("O valor total será: %.2f", valor_total, " R$" ); 
		}
		leia.close();
	}

}
