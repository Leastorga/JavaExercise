package exemplos;
import java.util.Scanner;

public class ExemploSwitchCase2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número:");
		int numero = leia.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Bem-vindo à Janeiro");
			break;
		case 2:
			System.out.println("Bem-vindo à Fevereiro");
			break;
		case 3:
			System.out.println("Bem-vindo à Março");
			break;
		case 4:
			System.out.println("Bem-vindo à Abril");
			break;
		case 5:
			System.out.println("Bem-vindo à Maio");
			break;
		case 6:
			System.out.println("Bem-vindo à Junho");
			break;
		case 7:
			System.out.println("Bem-vindo à Julho");
			break;
		case 8:
			System.out.println("Bem-vindo à Agosto");
			break;
		case 9:
			System.out.println("Bem-vindo à Setembro");
			break;
		case 10:
			System.out.println("Bem-vindo à Outubro");
			break;
		case 11:
			System.out.println("Bem-vindo à Novembro");
			break;
		case 12:
			System.out.println("Bem-vindo à Dezembro");
			break;
						
		default:
			System.out.println("Esse número não possui um mês correspondente!");
			break;
		
		}
		leia.close();
	}

}
