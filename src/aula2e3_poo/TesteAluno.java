package aula2e3_poo;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] main) {
		
		//Instanciar obj Aluno
		// o nome da variável pode ser qualquer coisa (respeitanto as restrições)
		// um objeto é uma variável
		// se o objeto é uma variável ele tem: tipo e nome
		// se o nome da variável pode ser qualquer coisa ENTÃO o nome do objeto pode ser qualquer coisa
		// Qual o tipo do objeto aluno? Aluno (TAD - Tipo Abstrato de Dado)
		Aluno aluno = new Aluno();
		//new é um operador de instanciação
		
		Aluno aluno2 = new Aluno();
		
		Scanner input = new Scanner(System.in);
		
		
		// Vamos manipular o objeto
		
		System.out.println("Informe os dados do aluno 1: ");
		// Acessando atributo através do objeto
		aluno.nome = input.next();
		aluno.curso = input.next();
		aluno.turma = input.next();
		aluno.idade = input.nextInt();
		aluno.sexo = input.next().charAt(0);
		aluno.matricula = input.nextInt();
		
		// Acessando métodos através do objeto
		System.out.println("\n### Aluno 1 ###\n");
		aluno.imprimirDados();
		
		
		double valorBoleto = aluno.gerarBoleto();
		
		System.out.println("Informe os dados do aluno 2: ");
		aluno2.nome = input.next();
		aluno2.curso = input.next();
		aluno2.turma = input.next();
		aluno2.idade = input.nextInt();
		aluno2.sexo = input.next().charAt(0);
		aluno2.matricula = input.nextInt();
		
		System.out.println("\n### Aluno 2 ###\n");
		
		aluno2.imprimirDados();
		
		
		System.out.println("Copiando os dados do aluno 2 para o aluno 1...");
		
		aluno.copiarAluno(aluno2);
		
		System.out.println("\n### Aluno 1 ###\n");
		
		aluno.imprimirDados();
		
		
		
	}
	
}


//ExemploIO eu preciso importar? sim pois estão em pacotes diferentes
//Aluno eu preciso importar? não pois estão no mesmo pacote