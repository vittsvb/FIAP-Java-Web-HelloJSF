package br.com.fiap.si.bo;

import java.text.NumberFormat;

public class Calculadora {

	public String calcularFormato(Double n1, Double n2, String op) {

		Double resultado = null;

		switch (op) {
		case "+":
			resultado = n1 + n2;
			break;
		case "-":
			resultado = n1 - n2;
			break;
		case "*":
			resultado = n1 * n2;
			break;
		case "/":
			if (n2 == 0) {
				throw new ArithmeticException("Não dividir por 0");
			}
			resultado = n1 / n2;
			break;
		}
		
		NumberFormat fmt = NumberFormat.getInstance();
		fmt.setMaximumFractionDigits(0);
		fmt.setMinimumIntegerDigits(2);
		
		return fmt.format(resultado);

	}

}
