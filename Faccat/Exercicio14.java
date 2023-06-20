package faccat;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1;
		System.out.println("Digite um número: ");
		numero1 =  leia.nextInt();
		if (numero1 < 10){
			System.out.println("esse número NÃO É MAIOR QUE 10!");
		} else {
			System.out.println("esse número É MAIOR QUE 10!");
		}
		
		leia.close();
	}

}
