//João Vitor Souza Santiago RA:a2767082

/* A classe wrapper Byte é uma classe que encapsula um tipo primitivo byte e o transforma em objeto para permitir sua manipulação */

public class TstByte_João_Souza {

	/* Este método demonstra a conversão de uma String para o tipo primitivo byte usando parseByte(), o que é útil na leitura de entradas de baixo nível.
	i) Classe Byte: método parseByte(String s)
	ii) O método converte uma String contendo um número para o tipo primitivo 'byte'. Como 'byte' tem um limite (de -128 a 127), ele é ideal para validar se a entrada do usuário se 	encaixa nesse intervalo.
	iii) Referência: Site: w3Schools, canal do youtube Minerando Conhecimento */

	public void converterByte(String numeroEmString) {
		System.out.println("Método 1: Converter String para Byte");

		try {
			byte b = Byte.parseByte(numeroEmString);
			System.out.println("String '" + numeroEmString + "' convertida para byte: " + b);
		} catch (NumberFormatException e) {
			System.out.println("Erro: A String '" + numeroEmString + "' não é um byte válido (deve ser entre -128 a 127)");
		}
	}

	/* Este método demonstra como obter o valor do objeto Byte como um int primitivo usando intValue(), uma conversão comum em cálculos.
	i) Classe Byte: método intValue()
	ii) Este método desempacota (unboxes) o objeto Byte e o retorna como um 'int' primitivo. Isso é útil quando um byte é lido e precisa ser usado em operações aritméticas mais 	abrangentes que exigem o tipo 'int'.
	iii) Referência: Site: w3Schools, canal do youtube Minerando Conhecimento */

	public void obterValor(Byte valorByte) {
        	System.out.println("Método 2: Obter valor como Int");
        
        	int valorInt = valorByte.intValue();
        
        	System.out.println("Objeto Byte (" + valorByte + ") retornado como int: " + valorInt);
        	System.out.println("Demonstração de cálculo (valorInt + 1000): " + (valorInt + 1000));
	}
}
