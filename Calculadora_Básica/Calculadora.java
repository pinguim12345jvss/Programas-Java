import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;

		System.out.println("\n=== CALCULADORA JAVA ===");

		System.out.println("\nDigite o primeiro valor (a): ");
		double a = scanner.nextDouble();

		System.out.println("\nDigite o segundo valor (b): ");
		double b = scanner.nextDouble();

		while (opcao != 0) {
			System.out.println("\n -- Menu de Opções: --\n");
			System.out.println("1 - Soma (a+b)");
			System.out.println("2 - Multiplicação (a*b)");
			System.out.println("3 - Subtração (a-b)");
			System.out.println("4 - Divisão (a/b)");
			System.out.println("0 - Sair do Programa");
			System.out.println("\nEscolha uma opção: \n");
			
			if (scanner.hasNextInt()) {
				opcao = scanner.nextInt();

				switch (opcao) {
					case 1:
						System.out.println("\nA soma de a + b é: " + (a + b));
						break;
					case 2:
						System.out.println("\nA multiplicação de a * b é: " + (a * b));
						break;
					case 3:
						System.out.println("\nA subtração de a - b é: " + (a - b));
						break;
					case 4:
			   			if (b != 0) {
							System.out.println("\nA divisão de a / b é: " + (a / b));
			   			} else {
							System.out.println("\nNão pode dividir por zero");
						}
						break;
					case 0:
						System.out.println("\nSaiu do programa");
						break;
					default:
						System.out.println("\n -- Opção inválida -- \n\n Selecione um dos números do menu.");
				}
			} else {
				System.out.println("Entrada inválida, insira um número presente nas opções.");
				scanner.next();
			}
		}
		scanner.close();
	}
}




