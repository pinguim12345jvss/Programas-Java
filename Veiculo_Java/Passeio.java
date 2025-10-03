//João Vitor Souza Santiago RA:a2767082

public final class Passeio extends Veiculo implements Calc {

	private int qtdePassageiro;

	//Método construtor

	public Passeio() {
		super();
		this.qtdePassageiro = 0;
	}

	public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int qtdePassageiro) {
		super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
		this.qtdePassageiro = qtdePassageiro;
	}

	//Getters e Setters

	public int getQtdePassageiro() {
		return qtdePassageiro;
	}

	public void setQtdePassageiro(int qtdePassageiro) {
		this.qtdePassageiro = qtdePassageiro;
	}

	//Método Calc

	public int calcVel() {
		int velocidadeKmH = getVelocMax();
		int velocidadeMH = velocidadeKmH * 1000;
		return velocidadeMH;
	}

	//Implementação Método interface Calc
	
	public int calcular() {
		int somaLetras = 0;
		
		somaLetras += getPlaca().length();
		somaLetras += getMarca().length();
        	somaLetras += getModelo().length();
        	somaLetras += getCor().length();
        	somaLetras += getDataCadastro().length();

		return somaLetras;
	}
}