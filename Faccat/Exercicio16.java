package faccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int macas;
		double valor_total;
		
		System.out.println("Quantas ma�as voc� deseja comprar?");
		macas = leia.nextInt();
		
		if (macas<12) {
			valor_total = macas * 1.30;
			System.out.printf("O valor total ser�: %.2f", valor_total, " R$" ); 
			
		} else {
			valor_total = macas * 1;
			System.out.printf("O valor total ser�: %.2f", valor_total, " R$" ); 
		}
		leia.close();
	}

}
