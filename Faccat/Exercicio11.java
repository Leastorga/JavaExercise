package faccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual é o salário fixo?");
		double salarioFixo = leia.nextDouble();
		System.out.println("Digite a quantidade de carros vendidos.");
		double carrosVendidos = leia.nextDouble();
		System.out.println("Digite a comissão fixa para cada carro vendido.");
		double comissao = leia.nextDouble();
		System.out.println("Digite o valor total das vendas.");
		double valorVendas = leia.nextDouble();
		
		
		double comissaoCarros = carrosVendidos * (salarioFixo * comissao / 100);
		double comissaoVendas =  valorVendas * 5 / 100;
		double salarioFinal = salarioFixo + comissaoCarros + comissaoVendas;
		
		System.out.println("O salário final desse vendedor é igual à: " + salarioFinal + " R$.");
		
		leia.close();

	
	}

}
	