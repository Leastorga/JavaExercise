package exemplos;
import java.util.Scanner;

public class ExemploSwitchCase2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		int numero = leia.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Bem-vindo � Janeiro");
			break;
		case 2:
			System.out.println("Bem-vindo � Fevereiro");
			break;
		case 3:
			System.out.println("Bem-vindo � Mar�o");
			break;
		case 4:
			System.out.println("Bem-vindo � Abril");
			break;
		case 5:
			System.out.println("Bem-vindo � Maio");
			break;
		case 6:
			System.out.println("Bem-vindo � Junho");
			break;
		case 7:
			System.out.println("Bem-vindo � Julho");
			break;
		case 8:
			System.out.println("Bem-vindo � Agosto");
			break;
		case 9:
			System.out.println("Bem-vindo � Setembro");
			break;
		case 10:
			System.out.println("Bem-vindo � Outubro");
			break;
		case 11:
			System.out.println("Bem-vindo � Novembro");
			break;
		case 12:
			System.out.println("Bem-vindo � Dezembro");
			break;
						
		default:
			System.out.println("Esse n�mero n�o possui um m�s correspondente!");
			break;
		
		}
		leia.close();
	}

}
