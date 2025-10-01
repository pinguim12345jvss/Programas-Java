//João Vitor Souza Santiago RA:a2767082

/* A classe wrapper Character tem a função de manipular, verificar e converter um valor do tipo primitivo Char para que se possa o utilizar como objeto.*/

public class TstChar_João_Souza {
	/* Este método demonstra como a classe Character é usada para classificar um caractere, verificando se ele é uma letra ou um dígito
	i) Classe Character: métodos isLetter(char ch) e isDigit(char ch)
	ii) O método recebe um caractere e usa isLetter() para checar se ele é uma letra do alfabeto e isDigit() para checar se ele é um dígito
	iii) Referência: Canal do youtube: BroCode, site: Devmedia, site: Linhadecodigo.  */
	
	public void classificarCaractere(char caractere) {
		System.out.println("Método 1: Classificar Caractere");
		System.out.println("Caractere de entrada: ' " + caractere + " ' ");

		boolean letter = Character.isLetter(caractere);
		System.out.println("É uma letra? " + letter);

		boolean digit = Character.isDigit(caractere);
		System.out.println("É um digito? " + digit);
	}

	/* Este método demonstra a conversão de um caractere para maiúscula e minúscula, uma operação comum em manipulação de strings.
	i) Classe Character: métodos toUpperCase(char ch) e toLowerCase(char ch)
	ii) O método recebe um caractere e o converte explicitamente para sua representação em maiúscula e minúscula, se aplicável.
	iii) Referência: Canal do youtube: BroCode, site: Devmedia, site: Linhadecodigo. */

	public void converterCaixa(char caractere) {
		System.out.println("Método 2: Converter Caixa");
		System.out.println("Caractere de entrada: ' " + caractere + " ' ");

		char maiuscula = Character.toUpperCase(caractere);
		System.out.println("Convertido para maiúscula: " + maiuscula);

		char minuscula = Character.toLowerCase(caractere);
		System.out.println("Convertido para minuscula: " + minuscula);
	}
}

	