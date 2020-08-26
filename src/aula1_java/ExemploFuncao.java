package aula1_java;

public class ExemploFuncao {

	static int a = 0;
	
	public static void main(String[] args) {
		
		int b;
	    
	    funcao2();
	    funcao1(3);

	    b = a * 2;

	    System.out.printf("O valor de b eh: %d\n", b);
		
	}
	
	static void funcao1(int x){

	    int y = x + a;
	    a = y + x;

	}

	static void funcao2(){

	    a = 3;

	}
	
}
