import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro valor (a): ");
		double a = scanner.nextDouble();

		System.out.println("\nDigite o segundo valor (b): ");
		double b = scanner.nextDouble();

		System.out.println("\nMenu de Opções:");
		System.out.println("1 - Soma (a+b)");
		System.out.println("2 - Multiplicação (a*b)");
		System.out.println("3 - Subtração (a-b)");
		System.out.println("4 - Divisão (a/b)");
		System.out.println("Escolha uma opção: ");

		int opcao = scanner.nextInt();

		switch (opcao) {
			case 1:
				System.out.println("A soma de a + b é: " + (a + b));
				break;
			case 2:
				System.out.println("A multiplicação de a * b é: " + (a * b));
				break;
			case 3:
				System.out.println("A subtração de a - b é: " + (a - b));
				break;
			case 4:
			   if (b != 0) {
				System.out.println("A divisão de a / b é: " + (a / b));
			   } else {
				System.out.println("Não pode dividir por zero");
				}
				break;
			default:
				System.out.println("Opção inválida");
		}

		scanner.close();
	}
}




