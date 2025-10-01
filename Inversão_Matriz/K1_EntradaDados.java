//João Vitor Souza Santiago RA: a2767082

import java.util.InputMismatchException;
import java.util.Scanner;

public class K1_EntradaDados {
	private Scanner scanner;

	public K1_EntradaDados(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getDimensao(String prompt) {
		int dimensao = 0;
		while (dimensao <= 0) {
			try{
				System.out.printf("Digite o numero de %s: ", prompt);
				dimensao = scanner.nextInt();
				if (dimensao <= 0) {
					System.out.println("\nValor invalido: Digite um numero positivo.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nValor invalido: Digite um numero inteiro");
				scanner.next();
			}
		}
		return dimensao;
	}

	public void preencherMatriz(K1_Matriz matriz) {
		int linhas = matriz.getLinhas();
		int colunas = matriz.getColunas();
		System.out.println("\n-- Elementos da Matriz --");

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				boolean entradaValida = false;
				while (!entradaValida) {
					try {
						System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
						int valor = scanner.nextInt();
						matriz.setElemento(i, j, valor);
						entradaValida = true;
					} catch (InputMismatchException e) {
						System.out.println("Entrada Invalida");
						scanner.next();
					}
				}
			}
		}
		scanner.nextLine();
	}
}


		


