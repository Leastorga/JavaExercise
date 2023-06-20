package faccat;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[]args){
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idadeanos = leia.nextInt();
		System.out.println("Especifique os meses");
		int idademeses = leia.nextInt();
		System.out.println("Quantos dias desde do seu último mesversário?");
		int idadedias = leia.nextInt();
		int diasvividos = idadeanos * 365 + idademeses * 30 + idadedias;
		System.out.println("O total de dias vividos: " + diasvividos);
		
		leia.close();
		
	}

}
