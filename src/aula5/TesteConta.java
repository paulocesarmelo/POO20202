package aula5;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		Scanner input = new Scanner(System.in);
		
		//c1.num = -1; //não pode haver conta negativa
		
		int i = input.nextInt();
		c1.setNum(i);
		
		//QUERO IMPRIMIR O NUMERO DA CONTA --> CRIA O MÉTODO
		System.out.println("Numero = "+ c1.getNum());
		
	}
	
}