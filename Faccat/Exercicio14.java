package faccat;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1;
		System.out.println("Digite um n�mero: ");
		numero1 =  leia.nextInt();
		if (numero1 < 10){
			System.out.println("esse n�mero N�O � MAIOR QUE 10!");
		} else {
			System.out.println("esse n�mero � MAIOR QUE 10!");
		}
		
		leia.close();
	}

}
