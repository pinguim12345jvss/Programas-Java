import java.util.Scanner;

public class TstCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int opcao = -1;

		System.out.println("\n=== CALCULADORA JAVA ===");

		System.out.println("\nDigite o primeiro valor (a): ");
		Numero a = new Numero(scanner.nextDouble());

		System.out.println("\nDigite o segundo valor (b): ");
		Numero b = new Numero(scanner.nextDouble());

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
				
			try {
				switch (opcao) {
					case 1:
						System.out.println("\nA soma de " + a + " + " + b + " é: " + calc.somar(a, b));
						break;
					case 2:
						System.out.println("\nA multiplicação de " + a + " * " + b + " é: " + calc.multiplicar(a, b));
						break;
					case 3:
						System.out.println("\nA subtração de " + a + " - " + b + " é: " + calc.subtrair(a, b));
						break;
					case 4:
						System.out.println("\nA divisão de " + a + " / " + b + " é: " + calc.dividir(a, b));
						break;
					case 0:
						System.out.println("\nSaiu do programa");
						break;
					default:
						System.out.println("\n -- Opção inválida -- \n\n Selecione um dos números do menu.");
				}
			} catch (ArithmeticException e) {
				System.out.println("\nErro: " + e.getMessage());
			}
			} else {
				System.out.println("Entrada inválida, insira um número presente nas opções.");
				scanner.next();
			}
		}
		scanner.close();
	}
}




