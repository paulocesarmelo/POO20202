package aula1_java;

import java.util.Scanner;

public class ExemploIF {

	public static void main(String[] args) {
		
		int cont = 0, idade;
	    char sexo;

	    Scanner input = new Scanner(System.in);
	    
	  
	    System.out.printf("Informe o sexo (m-masc e f-fem): \n"); 
	    
	    sexo = input.next().charAt(0); //para ler caracter
	    
	    System.out.printf("Informe a idade: \n");
	    
	    idade = input.nextInt();

	    if(sexo == 'm' && idade >= 18){
	    	System.out.println("masc maior que 18");
	    }else if(sexo == 'f' && idade >= 18 ){
	    	System.out.println("fem maior que 18");
	    }
	    
		
	}
	
}


