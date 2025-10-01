//João Vitor Souza Santiago RA:a2767082

import java.util.Arrays;

public class K1_Matriz {

	private int[][] matriz;
	private int linhas;
	private int colunas;

	public K1_Matriz(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.matriz = new int[linhas][colunas];
	}

	//Getters e setters

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setElemento(int linha, int coluna, int valor) {
		if (linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas) {
			this.matriz[linha][coluna] = valor;
		} else {
			System.err.println("Erro, fora dos limites da matriz");
		}
	}

	//Método principal

	public String getMatrizEmOrdem() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				sb.append(matriz[i][j]).append(" ");
			}
		}
		return sb.toString().trim();
	}
	
	public String getMatrizEmOrdemInversa() {
		StringBuilder sb = new StringBuilder();
		for (int i = linhas - 1; i >= 0; i--) {
			for (int j = linhas - 1; j >= 0; j--) {
				sb.append(matriz[i][j]).append(" ");
			}
		}
		return sb.toString().trim();
	}
}
	

