//João Vitor Souza Santiago RA:a2767082

import java.util.Scanner;

public class TstVeic_João_Souza {

	public static void main(String[] args) {

		Leitura l = new Leitura();

		Passeio veicPasseio = new Passeio();
		Carga veicCarga = new Carga();
		
		String opcao = "";

		do {
			System.out.println("\n--- Cadastro e calculo de veículos ---");
			System.out.println("1 - Cadastrar e exibir veículo de Passeio");
			System.out.println("2 - Cadastrar e exibir veículo de Carga");
			System.out.println("S - Sair do Programa");
		
			opcao = l.entDados("Escolha uma opção: ").toUpperCase();
			
				switch (opcao) {
					case "1":
						cadastrarExibirPasseio(l, veicPasseio);
						break;
					case "2":
						cadastrarExibirCarga(l, veicCarga);
						break;
					case "S":
						System.out.println("Saiu do Programa");
						break;
					default:
						System.out.println("Opção inválida");
			}
		} while (!opcao.equals("S"));
	}
		
	//Métodos auxiliares

	private static void cadastrarExibirPasseio(Leitura l, Passeio p) {
		System.out.println("\n-- Cadastro veículo de Passeio --");

		Motor motorP = lerDadosMotor(l);
		p.setMotor(motorP);

		lerDadosVeiculo(l, p);

		p.setQtdePassageiro(Integer.parseInt(l.entDados("Informe a quantidade de passageiros: ")));

		exibirDadosPasseio(p);
	}

	private static void cadastrarExibirCarga(Leitura l, Carga c) {
		System.out.println("\n-- Cadastro veículo de Carga --");

		Motor motorC = lerDadosMotor(l);
		c.setMotor(motorC);

		lerDadosVeiculo(l, c);

		c.setTara(Integer.parseInt(l.entDados("Informe a tara do veículo: ")));
		c.setCargaMax(Integer.parseInt(l.entDados("Informe a carga máxima do veículo: ")));

		exibirDadosCarga(c);
	}

	private static Motor lerDadosMotor(Leitura l) {
		System.out.println("\n-- Dados Motor --");
		int qtdPistoes = Integer.parseInt(l.entDados("Informe a quantidade de pistões do motor: "));
		int potencia = Integer.parseInt(l.entDados("Informe a potência do motor: "));

		return new Motor(qtdPistoes, potencia);
	}

	private static void lerDadosVeiculo(Leitura l, Veiculo v) {
        	System.out.println("\n-- Dados gerais veículo --");
		v.setPlaca(l.entDados("Informe a Placa:"));
        	v.setMarca(l.entDados("Informe a Marca:"));
        	v.setModelo(l.entDados("Informe o Modelo:"));
        	v.setCor(l.entDados("Informe a Cor:"));
        	v.setQtdRodas(Integer.parseInt(l.entDados("Informe a Quantidade de Rodas:")));
        v.setDataCadastro(l.entDados("Informe a Data de Cadastro:"));

        	v.setVelocMax(Integer.parseInt(l.entDados("Informe a velocidade máxima em Km/h: ")));
    	}

	private static void exibirDadosPasseio(Passeio p) {
        	System.out.println("\n=============================================");
        	System.out.println("         DADOS DO VEÍCULO DE PASSEIO         ");
        	System.out.println("=============================================");
		System.out.println("Placa: " + p.getPlaca());
        	System.out.println("Marca: " + p.getMarca());
        	System.out.println("Modelo: " + p.getModelo());
        	System.out.println("Cor: " + p.getCor());
        	System.out.println("Qtd Rodas: " + p.getQtdRodas());
        	System.out.println("Data Cadastro: " + p.getDataCadastro());
        	System.out.println("Velocidade Máxima (Km/h): " + p.getVelocMax());
        	System.out.println("Qtd Passageiros: " + p.getQtdePassageiro());
        
        // Dados do Motor
        	System.out.println("\n--- Dados do Motor ---");
        	System.out.println("Qtd Pistões: " + p.getMotor().getQtdPistoes());
        	System.out.println("Potência: " + p.getMotor().getPotencia());
  		
		System.out.println("\n--- Cálculos especificos ---");
     	   	System.out.println("Velocidade em M/h (Metros por Hora): " + p.calcVel());
        
        	System.out.println("Soma das Letras: " + p.calcular());
        	System.out.println("=============================================\n");
    	}

	private static void exibirDadosCarga(Carga c) {
        	System.out.println("\n=============================================");
        	System.out.println("         DADOS DO VEÍCULO DE CARGA           ");
        	System.out.println("=============================================");
		System.out.println("Placa: " + c.getPlaca());
        	System.out.println("Marca: " + c.getMarca());
        	System.out.println("Modelo: " + c.getModelo());
        	System.out.println("Cor: " + c.getCor());
        	System.out.println("Qtd Rodas: " + c.getQtdRodas());
        	System.out.println("Data Cadastro: " + c.getDataCadastro());
        	System.out.println("Velocidade Máxima (Km/h): " + c.getVelocMax());
        	System.out.println("Tara: " + c.getTara());
        	System.out.println("Carga Máxima: " + c.getCargaMax());
        
        // Dados do Motor
        	System.out.println("\n--- Dados do Motor ---");
        	System.out.println("Qtd Pistões: " + c.getMotor().getQtdPistoes());
        	System.out.println("Potência: " + c.getMotor().getPotencia());
        
        	System.out.println("\n--- Cálculos especificos ---");
        	System.out.println("Velocidade em Cm/h (Centímetros por Hora): " + c.calcVel());
        
        System.out.println("Soma dos Atributos Numéricos: " + c.calcular());
        System.out.println("=============================================\n");
    }
}	




			


