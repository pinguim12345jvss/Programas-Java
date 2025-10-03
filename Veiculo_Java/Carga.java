//João Vitor Souza Santiago RA:a2767082

public final class Carga extends Veiculo implements Calc {

	private int tara;
	private int cargaMax;

	//Construtores

	public Carga() {
		super();
		this.tara = 0;
		this.cargaMax = 0;
	}

	public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro, int tara, int cargaMax) {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, motor, dataCadastro);
        this.tara = tara;
        this.cargaMax = cargaMax;
    }

	//Getters e Setters

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}	


	//Método abstrato

	public int calcVel() {
		int velocidadeKmH = getVelocMax();
		int velocidadeCmH = velocidadeKmH * 100000;
		return velocidadeCmH;
	}

	public int calcular() {
		int somaValoresNumericos = 0;
		
		somaValoresNumericos += getQtdRodas();
        	somaValoresNumericos += getVelocMax();
        	somaValoresNumericos += getMotor().getQtdPistoes();
        	somaValoresNumericos += getMotor().getPotencia();

		somaValoresNumericos += getTara();
		somaValoresNumericos += getCargaMax();
		
		return somaValoresNumericos;
	}
}