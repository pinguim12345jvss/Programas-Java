//João Vitor Souza Santiago RA:a2767082

public class Motor {

	private int qtdPistoes;
	private int potencia;

	public Motor() {
		this.qtdPistoes = 0;
		this.potencia = 0;
	}

	public Motor(int qtdPistoes, int potencia) {
		this.qtdPistoes = qtdPistoes;
		this.potencia = potencia;
	}

	public int getQtdPistoes() {
		return qtdPistoes;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setQtdPistoes(int qtdPistoes) {
		this.qtdPistoes = qtdPistoes;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
