package modelo;

public enum Calculadora {

	SOMAR('+') {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	},
	SUBTRAIR('-') {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}
	},
	DIVIDIR('/') {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	},
	MULTIPLICAR('*') {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	};

	private char operador;

	Calculadora(char op) {

		this.operador = op;

	}

	public abstract double executarOperacao(double x, double y);

	public char getOperador() {
		return operador;
	}

	public String toString() {

		return String.valueOf(operador);
	}

}
