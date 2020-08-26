package aula1_java;

import java.util.Scanner;

public class ExemploIO {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		float peso;
		double altura;
		int idade;
		char sexo;
		boolean estaLegal;
		
		
		System.out.println("Informe o nome: ");
		nome = input.nextLine();
		
		System.out.println("Informe o peso: ");
		peso = input.nextFloat();
		
		System.out.println("Informe a altura: ");
		altura = input.nextDouble();
		
		System.out.println("Informe a idade: ");
		idade = input.nextInt();
		
		System.out.println("Informe o sexo (m ou f): ");
		sexo = input.next().charAt(0);
		
		System.out.println("Está gostando de POO (true ou false): ");
		estaLegal = input.nextBoolean();
		
		//Imprimir os dados
		
		System.out.println("Nome: "+ nome);
		System.out.println("Peso: "+ peso);
		System.out.println("Altura: "+ altura);
		System.out.println("Idade: "+ idade);
		
		if(sexo == 'm') {
			System.out.println("Sexo: masculino");
		}else if(sexo == 'f') {
			System.out.println("Sexo: feminino");
		}
		
		System.out.println("Está gostando? "+ estaLegal);
		
	}
	
}
