//João Vitor Souza Santiago RA:a2767082

/* A classe wrapper Float tem a função de encapsular o tipo primitivo float e tratar-lo como objeto */

public class TstFloat_João_Souza {

	/* Este método demonstra a obtenção da representação binária de 32 bits de um float,o que é útil para depuração e análise de ponto flutuante em baixo nível.
	i) Classe Float: método floatToIntBits(float value)
	ii) O método retorna a representação binária do valor 'float' de ponto flutuante no formato IEEE 754. O resultado é um 'int' que representa os 32 bits do 'float'.
        iii) Referência: Site: w3Schools, site: linhadecodigo */

	public void exibirBinaria(float valorFloat) {
        	System.out.println("Método 1: Exibir representação binaria");

        	int bits = Float.floatToIntBits(valorFloat);
        
        	String representacaoBinaria = Integer.toBinaryString(bits);
        
        	System.out.println("Valor Float: " + valorFloat);
        	System.out.println("Representação em 32 bits (int): " + bits);
        	System.out.println("Representação Binária (IEEE 754): " + representacaoBinaria);
	}
        
	/* Este método demonstra o método estático para comparação de dois floats. Deve ser usado em vez de '==' para evitar problemas de precisão.
	i) Classe Float: método compare(float f1, float f2)
	ii) Este método compara dois valores 'float' primitivos numericamente. Ele retorna 0 se forem iguais, um valor negativo se 'f1 < f2' ou um valor positivo se 'f1 > f2'.
	iii) Referência: Site: w3Schools, site: linhadecodigo */

	public void compararVal(float floatA, float floatB) {
        	System.out.println("Método 2: Comparar dois valores");
        	int comparacao = Float.compare(floatA, floatB);
        
        	System.out.println("Comparando " + floatA + " com " + floatB + ". Resultado: " + comparacao);
        
        	System.out.println("Comparando 0.1f com 0.2f. Resultado: " + Float.compare(0.1f, 0.2f));
        	System.out.println("Comparando 0.2f com 0.1f. Resultado: " + Float.compare(0.2f, 0.1f));
	}
}
