import java.util.Scanner;

public class Inversão_Matrizes {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	K1_EntradaDados entrada = new K1_EntradaDados(scanner);

	System.out.println("--- Inversor de Matrizes Bidimensionais ---");

	int numLinhas = entrada.getDimensao("linhas");
	int numColunas = entrada.getDimensao("colunas");

	K1_Matriz matriz = new K1_Matriz(numLinhas, numColunas);

	entrada.preencherMatriz(matriz);

	System.out.println("\n-- Ordem de entrada --");
	System.out.println("Matriz original:\n");

	int[][] matrizOriginal = matriz.getMatriz();
	for (int i = 0; i < matriz.getLinhas(); i++) {
		System.out.print("| ");
		for (int j = 0; j < matriz.getColunas(); j++) {
			System.out.printf("%4d ", matrizOriginal[i][j]);
		}
		System.out.println("|");
	}

	System.out.println("\n--- Ordem Inversa ---");
	String ordemInversa = matriz.getMatrizEmOrdemInversa();
	System.out.println(ordemInversa);

	scanner.close();
	}
}
	