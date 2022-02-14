package principal;

import modelo.Calculadora;

/*-Escreva um Enum que represente as quatro operaçoes
matematicas: somar, subtrair, multiplicar e dividir.

-O Enum deve ter um construtor que receba o simbolo da operacao;
-Sobrescreva o metodo toString que retorne somente o simbolo da operacao;
-Implemente um metodo abstrato com a seguinte assinatura double executarOperacao(double x, double y).
Cada opção do Enum deve implementar esse metodo realizando a operacao
de acordo com a sua descricao;
-Escreva um metodo main para teste que realize todas as operações do Enum.
Dica: Você pode usar o metodo values para iterar o Enum e realizar todas as operações
*/

public class Principal {

	public static void main(String[] args) {

		double a = 20.0;
		double b = 10.0;

		for (Calculadora cal : Calculadora.values()) {

			System.out.println("Resultado da operação de " + a + " " + cal.toString() + " " + b + " = ");

			System.out.println(cal.executarOperacao(a, b));

		}

	}
}
