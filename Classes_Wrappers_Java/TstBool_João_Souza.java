//João Vitor Souza Santiago Ra:a2767082

/* A classe wrapper Boolean tem a função de "embrulhar" o tipo primitivo boolean num objeto para que possa utilizar valores booleanos nestes objetos, tratando de valores como true e false */

public class TstBool_João_Souza {
	
	/* Este método demonstra a conversão de uma String para um primitivo 'boolean' usando parseBoolean(), o que é fundamental para validar entradas de usuários.
     	i) Classe Boolean: método parseBoolean(String s) 
	ii) O método converte uma String para o tipo primitivo 'boolean'. Ele retorna 'true' se a String for "true" (ignorando maiúsculas/minúsculas) caso contrário, retorna 'false'. 
	iii) Referência: Site W3Schools, site Devmedia, site Linhadecodigo */

	public void converterBoolean(String texto) {
		System.out.println("Método 1: Converter para Boolean");

		boolean resultado = Boolean.parseBoolean(texto);

		System.out.println("String de entrada: ' " + texto + " ' ");
		System.out.println("Resultado da conversão: " + resultado);

		System.out.println("Exemplo 'Yes' -> " + Boolean.parseBoolean("Yes"));
		System.out.println("Exemplo 'TRUE' -> " + Boolean.parseBoolean("TRUE"));
	}

	/* Este método demonstra a comparação entre dois objetos Boolean usando compare(). O método compare é útil para ordenação e lógica complexa.
	i) Classe Boolean: método compare(boolean x, boolean y)
	ii) Este método estático compara dois valores booleanos primitivos. Ele retorna 0 se os valores forem iguais, um valor positivo se 'x' for 'true' e 'y' for 'false', ou um valor 	negativo no caso contrário.
	iii) Referência: Site W3Schools, site Devmedia, site Linhadecodigo */

	public void compararValores(boolean boolA, boolean boolB) {
		System.out.println("Método 2: comparar valores");

		int comparacao1 = Boolean.compare(boolA, boolB);

		System.out.println("Comparando " + boolA + " com " + boolB + " Resultado: " + comparacao1);

		System.out.println("Comparando true com false. Resultado: " + Boolean.compare(true, false));
		System.out.println("Comparando false com true. Resultado: " + Boolean.compare(false, true));
	}
}
		
		
	
