public class Calculadora {
	public double somar(Numero a, Numero b){
		return a.valor + b.valor;
	}

	public double multiplicar(Numero a, Numero b){
		return a.valor * b.valor;
	}

	public double subtrair(Numero a, Numero b){
		return a.valor - b.valor;
	}

	public double dividir(Numero a, Numero b){
		if (b.valor == 0) {
			throw new ArithmeticException("Divisão por zero não permitida");
		}
		return a.valor / b.valor;
	}
}

