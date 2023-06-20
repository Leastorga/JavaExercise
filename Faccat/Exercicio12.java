package faccat;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite os graus em  Fahrenheit:");
		int fahrenheit = leia.nextInt();
		int conversao = (fahrenheit - 32)/9 * 5;
		System.out.println("Convertendo Fahrenheit para Celsius a temperatura é: " + conversao + "°C");
		leia.close();
	}

}
