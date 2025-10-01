//João Vitor Souza Santiago RA:a2767082

/* A classe wrapper Long tem a função de encapsular um tipo primitivo Long em um objeto para fornecer funcionalidades adicionais */

public class TstLong_João_Souza {
	
	/* Este método demonstra a conversão de um valor 'long' para uma String em base binária, útil para verificação em nível de bits de números grandes.
	i) Classe Long: método toBinaryString(long i)
	ii) O método converte o valor primitivo 'long' em uma String que representa sua representação binária (base 2). É essencial para sistemas que trabalham com manipulação de bits em 	números de 64 bits.
	iii) Referência: Site: w3Schools, site: DevMedia  */

	public void exibirBinario(long valorLong) {
        System.out.println("Método 1: exibirBinario");
        
        String binario = Long.toBinaryString(valorLong);
        
        System.out.println("Valor Original (decimal): " + valorLong);
        System.out.println("Representação em Binário (64 bits): " + binario);
        
        System.out.println("Número de bits: " + binario.length());
    }

	/* Este método demonstra a conversão de um número 'long' para seu objeto Wrapper equivalente, usando o método estático decode.
	i) Classe Long: método decode(String nm)
	ii) O método 'decode' é usado para decodificar uma String em um objeto Long. Ele suporta diferentes formatos de números inteiros: decimal (sem prefixo), hexadecimal ("0x" ou 	"#") 	e octal (prefixo "0").
	iii) Referência: Site: w3schools, site: DevMedia */

	public void decodificarString(String stringNum) {
        	System.out.println("Método 2: decodificarStringEmLong");
        
        try {
            	Long objLong = Long.decode(stringNum);
            	System.out.println("String decodificada: '" + stringNum + "'");
            	System.out.println("Resultado (objeto Long): " + objLong);
		System.out.println("Exemplo Hexadecimal ('0x10'): " + Long.decode("0x10"));
            
        	} catch (NumberFormatException e) {
            	System.out.println("Erro: A String '" + stringNum + "' não pode ser decodificada como Long.");
		}
	}
}
	