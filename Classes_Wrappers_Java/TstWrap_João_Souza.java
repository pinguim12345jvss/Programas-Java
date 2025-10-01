//João Vitor Souza Santiago RA:a2767082

/*Classe principal com o método main para chamar as outras classes e métodos wrappers*/

import java.util.Scanner;

public class TstWrap_João_Souza {
	public static void main(String[] args) {
	TstInt_João_Souza tstInt = new TstInt_João_Souza();
	TstBool_João_Souza tstBool = new TstBool_João_Souza();
	TstChar_João_Souza tstChar = new TstChar_João_Souza();
	TstDoub_João_Souza tstDoub = new TstDoub_João_Souza();
	TstByte_João_Souza tstByte = new TstByte_João_Souza();
	TstShort_João_Souza tstShort = new TstShort_João_Souza();
	TstFloat_João_Souza tstFloat = new TstFloat_João_Souza();
	TstLong_João_Souza tstLong = new TstLong_João_Souza();
	

	Scanner scanner = new Scanner(System.in);
	int opcao = -1;

	while (opcao != 0) {
		System.out.println("\n== Classes Wrappers ==\n");
		System.out.println("1) Integer");
		System.out.println("2) Boolean");
		System.out.println("3) Character");
		System.out.println("4) Double");
		System.out.println("5) Byte");
		System.out.println("6) Short");
		System.out.println("7) Float");
		System.out.println("8) Long");
		System.out.println("0) Sair do Programa\n");

		if (scanner.hasNextInt()) {
			opcao = scanner.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("\n-- Teste Integer --");
					tstInt.converter("25", 100);
					tstInt.exibirLimites();
					break;
				case 2:
					System.out.println("\n-- Teste Boolean --");
					tstBool.converterBoolean("True");
					tstBool.compararValores(true, false);
					break;
				case 3:
					System.out.println("\n-- Teste Character --");
					tstChar.classificarCaractere('A');
					tstChar.converterCaixa('b');
					break;
				case 4:
					System.out.println("\n-- Teste Double --");
					tstDoub.converterFloat("98.76", (123.45));
					tstDoub.verificarPropriedades(5.0);
					break;
				case 5:
					System.out.println("\n-- Teste Byte --");
					tstByte.converterByte("7");
					tstByte.obterValor((byte)120);
					break;
				case 6:
					System.out.println("\n-- Teste Short --");
					tstShort.converterEmBase((short) 125);
					tstShort.compararDoisValores((short) 500, (short) 500);
					break;
				case 7:
					System.out.println("\n-- Teste Float --");
					tstFloat.exibirBinaria(10.5f);
					tstFloat.compararVal(1.0f, 1.0000001f);
					break;
				case 8:
					System.out.println("\n-- Teste Long --");
					tstLong.exibirBinario(5000000L);
					tstLong.decodificarString("123456789");
					break;
					
				case 0:
					System.out.println("\n-- Saiu do programa --");
					break;
				default:
					System.out.println("\nOpção inválida");
			}
		} else {
			System.out.println("Entrada inválida, digite um numero");
			scanner.next();
		}
	    }
		scanner.close();
	}
}