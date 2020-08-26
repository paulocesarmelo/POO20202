package aula1_java;

import java.util.Scanner;

public class ExemploSintaxe {
	
	
	public static void main(String[] args) {
		
		//declaração
		int n, soma;		
		
		//COMANDO DE ENTRADA
		Scanner input = new Scanner(System.in); //input equivale a um leitor
		
		System.out.println("Informe um valor inteiro: ");
		//linha equivalente ao scanf
		n = input.nextInt();
		
		soma = n + n;
		
		//COMANDO DE SAÍDA
		System.out.println(n+" + "+n+ " = "+ soma);
		
		
		
		
		
	}
	
}
