package aula1_java;

public class Homem extends Primata {

	public void ver() {
		System.out.println("h vendo");
	}
	
	public static void main(String[] args) {
		int n = 10;
		int j = 0;
		
		for(int i = 0; i<n*0.6; i++) {
			
			if(i == n*0.3)
				j++;
			System.out.println(i);
			System.out.println(j);
		}
	}
}
