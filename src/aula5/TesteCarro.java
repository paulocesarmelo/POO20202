package aula5;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro("Ford");
		Carro carro3 = new Carro("Ford", "Mustang", 2020);
		
		//carro1.setarDados();
		
		//carro2.setarDados("Ford", "Mustang");
		
		//carro3.setarDados("Ford", "Mustang", 2019);
		
		
		carro1.setarDados("Volks", "Fusca");
		
		carro1.alterarMotor("2.2");
		
		System.out.println("\nCarro1");
		carro1.imprimiDados();
		
		System.out.println("\nCarro2");
		carro2.imprimiDados();
		
		
		System.out.println("\nCarro3");
		carro3.imprimiDados();
		
		
	}
	
}






