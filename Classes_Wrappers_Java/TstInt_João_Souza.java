//João Vitor Souza Santiago RA:a2767082

/* A classe wrapper Integer tem a função de "empacotar" um valor int em um objeto e utilizar ele em um array por exemplo, a classe também é utilizada para converter um valor Int para uma String ou outros tipos de valores */

public class TstInt_João_Souza {
	/* Este método demonstra a conversão de uma String para o tipo  int usando parseInt(), e a conversão de um int primitivo para um objeto Integer usando o método valueOf() da classe 	Wrapper. 
	i) Classe Integer: métodos parseInt(String s) e valueOf(int i)
    	ii) O método converte uma String contendo um número para o tipo primitivo 'int' e demonstra a criação de um objeto 'Integer' a partir de um primitivo 'int'.
        iii) Referência: Documentação oficial da Oracle/Java. site W3schools, site devmedia */

public void converter(String numeroEmString, int valorPrimitivo) {
	System.out.println("Método 1: Converter e empacotar");

	try {
		int x = Integer.parseInt(numeroEmString);
		System.out.println("String ' " + numeroEmString + " ' convertida para int: " + x);
	} catch (NumberFormatException e) {
		System.out.println("Erro: A String ' " + numeroEmString + " ' não é valida");
	}

	Integer objInt = Integer.valueOf(valorPrimitivo);
	System.out.println("int primitivo " + valorPrimitivo + " empacotado no objeto Integer: " + objInt);
	}
    	/*Este método demonstra como obter os valores máximo e mínimo que um tipo primitivo int pode armazenar, usando constantes da classe Integer.
	 i) Classe Integer: constantes MIN_VALUE e MAX_VALUE
	 ii) Este método exibe o menor e o maior valor que uma variável do tipo 'int' (32 bits) pode armazenar, úteis para validação de limites.
	 iii) Referência: Documentação oficial da Oracle/Java.*/


	public void exibirLimites() {
		System.out.println("Método 2: Exibir Limites");
		System.out.println("O menor valor para um int é: " + Integer.MIN_VALUE);
		System.out.println("O maior valor para um int é: " + Integer.MAX_VALUE);
	}
}

	


