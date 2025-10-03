//João Vitor Souza Santiago RA:a2767082

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Leitura {
	public String entDados(String mensagem) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String entrada = "";

		System.out.println(mensagem);

		try{
			entrada = br.readLine();
		} catch (IOException ioe) {
			System.out.println("Erro de entrada ou saida de dados: " + ioe.getMessage());
		}

		return entrada;
	}
}