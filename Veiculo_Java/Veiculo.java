//João Vitor Souza Santiago RA:a2767082

public abstract class Veiculo {

	private String placa;
	private String marca;        
    	private String modelo;       
    	private String cor;          
    	private int qtdRodas;        
    	private int velocMax;        
    	private Motor motor;         
    	private String dataCadastro;

	//Método Construtor

	public Veiculo() {
        	this.placa = "";
        	this.marca = "";
        	this.modelo = "";
        	this.cor = "";
        	this.qtdRodas = 0;
        	this.velocMax = 0;
        	this.motor = new Motor(); 
        	this.dataCadastro = "";
    }

	//Método Construtor argumentado

	public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, Motor motor, String dataCadastro) {
        	this.placa = placa;
        	this.marca = marca;
        	this.modelo = modelo;
        	this.cor = cor;
        	this.qtdRodas = qtdRodas;
        	this.velocMax = validarVelocMax(velocMax);
        	this.motor = motor;
        	this.dataCadastro = dataCadastro;
    }

	//Método Velocidade Máxima

    	private int validarVelocMax(int velocidade) {
	if (velocidade < 10 || velocidade > 250) {
		System.out.println("A velocidade está fora dos limites brasileiros.");
            	return 100;
        }
        return velocidade;
    }
	
	//Getters
    
	public String getPlaca() { return placa; }
    	public String getMarca() { return marca; }
    	public String getModelo() { return modelo; }
    	public String getCor() { return cor; }
    	public int getQtdRodas() { return qtdRodas; }
    	public int getVelocMax() { return velocMax; }
    	public Motor getMotor() { return motor; }
    	public String getDataCadastro() { return dataCadastro; }

	//Setters

    	public void setPlaca(String placa) { this.placa = placa; }
    	public void setMarca(String marca) { this.marca = marca; }
    	public void setModelo(String modelo) { this.modelo = modelo; }
    	public void setCor(String cor) { this.cor = cor; }
    	public void setQtdRodas(int qtdRodas) { this.qtdRodas = qtdRodas; }
    
    	public void setVelocMax(int velocMax) { 
        	this.velocMax = validarVelocMax(velocMax);
    }
    
    	public void setMotor(Motor motor) { this.motor = motor; }
    	public void setDataCadastro(String dataCadastro) { this.dataCadastro = dataCadastro; }

	//Método abstrato
    	public abstract int calcVel();
}