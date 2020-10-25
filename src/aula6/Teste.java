package aula6;

public class Teste {

	public static void main(String[] args) {
		
		Moto moto = new Moto();
		
		Carro carro = new Carro();
		
		carro.setMarca("Ford");
		carro.setModelo("Mustang");
		carro.setCor("Preta");
		carro.setAno(2020);
		carro.setChassi("123142h4h41g4");
		
		carro.imprimirDados();
		
	}
	
}
