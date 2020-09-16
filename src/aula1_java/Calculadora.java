package aula1_java;

public class Calculadora {

	double somar(double n1, double n2){
		
		double resultado = n1 + n2;
		
		return resultado;
		
	}
		
	double subtrair(double n1, double n2) {
		double resultado = n1 - n2;
		
		return resultado;
	}
	
	
	double multiplicar(double n1, double n2) {
		double resultado = n1 * n2;
		
		return resultado;
	}
	
	double divisor(double n1, double n2) {
		
		double resultado = 0;
		
		if(n2 != 0) {
			resultado = n1 / n2;
		}
		
		return resultado;
		
	}
	
	
}
