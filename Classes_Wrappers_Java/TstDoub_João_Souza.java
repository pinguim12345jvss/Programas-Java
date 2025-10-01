//João Vitor Souza Santiago RA:a2767082

/* A classe wrapper Double tem a função de permitir que valores do tipo double sejam tratados como objetos. */

public class TstDoub_João_Souza {

	/* Este método demonstra como converter uma String para um valor double primitivo (parseDouble) e como obter o valor do 	objeto Wrapper como um float (floatValue).
	i) Classe Double: métodos parseDouble(String s) e floatValue()
	ii) O método converte uma String para o tipo primitivo 'double' para cálculos e demonstra a conversão do objeto Double 	para o tipo primitivo 'float', o que pode causar perda de 	precisão.
	iii) Referência: Site: w3Schools, site: DevMedia, site: runestone.academy */

	public void converterFloat(String valorString, Double valorDouble) {
		System.out.println("Método 1: Converter Float");

		try {
			double primitivo = Double.parseDouble(valorString);
			System.out.println("String ' " + valorString + " ' convertida para double: " + primitivo);
		} catch (NumberFormatException e) {
			System.out.println("Erro: A String '" + valorString + "' não é um double valido");
		}

		float valorFloat = valorDouble.floatValue();
		System.out.println("Objeto Double (" + valorDouble + ") convertido para float: " + valorFloat);
	}

	/* Este método demonstra como a classe Double lida com valores especiais como Not-a-Number (NaN) e Infinito.
	i) Classe Double: métodos isNaN(double v) e isInfinite(double v)
	ii) O método recebe um valor 'double' e usa isNaN() para verificar se o resultado de uma operação é indefinido (como 0/0) e isInfinite() para checar se é um valor infinito (como 	divisão por zero).
	iii) Referência: Site: w3Schools, site: DevMedia, site: runestone.academy */

	public void verificarPropriedades(double num) {
		System.out.println("Método 2: Verificar Propriedades");
		
		double nan = 0.0 / 0.0;
		System.out.println("O valor '0.0 / 0.0' é NaN? " + Double.isNaN(nan));

		double infinito = 1.0 / 0.0;
		System.out.println("O valor '1.0 / 0.0' é infinito? " + Double.isInfinite(infinito));
		
		System.out.println("O valor de entrada (" + num + ") é infinito? " + Double.isInfinite(num));
	}
}

	