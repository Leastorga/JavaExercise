package faccat;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o total de de eleitores:");
		int eleitores = leia.nextInt();
		
		System.out.println("Digite o quantidade de votos nulos:");
		int votosNulos = leia.nextInt();
		System.out.println("Digite o quantidade de votos brancos:");
		int votosBrancos = leia.nextInt();
		System.out.println("Digite o quantidade de votos v�lidos:");
		int votosValidos = leia.nextInt();
		
		double percentualValidos = 100 * votosValidos/eleitores ;
		double percentualBrancos = 100 * votosBrancos/eleitores;
		double percentualNulos = 100 * votosNulos/eleitores;
		
		System.out.println("A porcentagem dos votos nulos � igual � " + percentualNulos + "%.");
		System.out.println("A porcentagem dos votos brancos � igual � " + percentualBrancos + "%.");
		System.out.println("A porcentagem dos votos v�lidos � igual � " + percentualValidos + "%.");
		
		
		leia.close();
		
	}

}
