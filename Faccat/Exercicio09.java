package faccat;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu sal�rio atual");
		double salario = leia.nextDouble();
		System.out.println("Digite o percentual de reajuste");
		double percentual = leia.nextDouble();
		double acrescento = salario * percentual / 100;
		double salarioAtual = salario + acrescento;
		
		System.out.println("O atual s�lario com o valor de reajuste " + percentual + " %" +" � igual � " + salarioAtual+ "R$");
		leia.close();
		
		

	}

}
