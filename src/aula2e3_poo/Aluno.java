package aula2e3_poo;

public class Aluno {

	//Atributos
	String nome, curso, turma;
	int matricula, idade;
	char sexo;
	
	//Métodos
	void atualizarNome(String novoNome){ 
		nome = novoNome;
	}
	
	void inserirDados(String n, String c, String t, int m, int i, char s) {
		nome = n;
		curso = c;
		turma = t;
		matricula = m;
		idade = i;
		sexo = s;
	}
	
	double gerarBoleto() {
		System.out.println("Boleto gerado");
		return 100;
	}
	
	void copiarAluno(Aluno aluno) {
		
		nome = aluno.nome;
		curso = aluno.curso;
		turma = aluno.turma;
		matricula = aluno.matricula;
		idade = aluno.idade;
		sexo = aluno.sexo;
		
		
	}
	
	//Usado para imprimir os atributos da classe
	void imprimirDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Curso: "+curso);
		System.out.println("Turma: "+turma);
		System.out.println("Matricula: "+matricula);
		System.out.println("Idade: "+idade);
		//System.out.printf("Idade: %d", idade);
		System.out.println("Sexo: "+sexo);
		
	}
	
}
