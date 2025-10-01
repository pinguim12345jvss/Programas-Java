//João Vitor Souza Santiago RA:a2767082

// A classe wrapper Short em Java, assim como as outras, empacota um objeto do tipo primitivo Short em um objeto, podendo ser utilizados em Arrays e conversão para outras formas primitivas

public class TstShort_João_Souza {

	/* Este método demonstra a conversão de um número para sua representação em String em uma base diferente (radix), o que é útil para sistemas de representação numérica.
	i) Classe Short: método toString(short s, int radix)
	ii) O método converte o valor primitivo 'short' para uma String na base (radix) especificada. Por exemplo, converter para a base 16 (hexadecimal) ou 2 (binário).
	iii) Referência: Site: Linhadecodigo, site: devcommunity .*/

	public void converterEmBase(short valorShort) {
        	System.out.println("Método 1: Converter para String em base");

		String binario = Integer.toString(valorShort, 2);
        	String hexa = Integer.toString(valorShort, 16);           
        	System.out.println("Valor Original (decimal): " + valorShort);
        	System.out.println("Em Binário (Base 2): " + binario);
        	System.out.println("Em Hexadecimal (Base 16): " + hexa);
	}

	/* Este método demonstra a comparação entre dois valores 'short' usando o método compare(). É crucial para a ordenação e lógica condicional.
	i) Classe Short: método compare(short x, short y)
	ii) Este método estático compara dois valores 'short' primitivos numericamente. Retorna 0 se forem iguais, um valor negativo se 'x < y' ou um valor positivo se 'x > y'.
	iii) Referência: Documentação oficial da Oracle/Java. */

	
	public void compararDoisValores(short shortA, short shortB) {
        	System.out.println("Método 2: Comparar dois valores");
        
        	int comparacao1 = Short.compare(shortA, shortB);
        
        	System.out.println("Comparando " + shortA + " com " + shortB + ". Resultado: " + comparacao1);
        
        	System.out.println("Comparando 100 com 50. Resultado: " + Short.compare((short)100, (short)50));
        	System.out.println("Comparando 50 com 100. Resultado: " + Short.compare((short)50, (short)100));
	}
}