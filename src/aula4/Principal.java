package aula4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Cadstro de uma pessoa em uma loja
		
		//Instanciando um objeto do tipo pessoa
		Pessoa pessoa = new Pessoa();
		Endereco end1 = new Endereco();
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o nome: ");
		pessoa.nome = input.nextLine();
		
		System.out.println("Digite o cpf: ");
		pessoa.cpf = input.nextLine();
		
		System.out.println("Digite a idade: ");
		pessoa.idade = input.nextInt();
		
		System.out.println("## Endereço ##");
		System.out.print("Rua: ");
		end1.rua = input.next();
		
		System.out.print("\nNum: ");
		end1.num = input.nextInt();
		
		System.out.print("\nQd: ");
		end1.qd = input.next();
		
		System.out.print("\nLt: ");
		end1.lote = input.next();
		
		System.out.print("Bairro: ");
		end1.bairro = input.next();
		
		//... completar ...
		
		pessoa.endResidencial = end1;
		
		pessoa.imprimirDados();
		
	}
	
}
