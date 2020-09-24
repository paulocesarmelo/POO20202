package aula5;

public class Carro {

	private static String motor = "2.0";
	
	private String marca,modelo;
	private int ano;
	
	public Carro() {
		this.marca = "";
		this.modelo = "";
		this.ano = 2020;
	}
	
	public Carro(String marca) {
		this.marca = marca;
		this.modelo = "";
		this.ano = 2020;
	}
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	void setarDados() {
		this.marca = "";
		this.modelo = "";
		this.ano = 2020;
	}
	
	void setarDados(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = 2020;
	}
	
	void setarDados(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	void alterarMotor(String motor) {
		this.motor = motor;
	}
	
	void imprimiDados() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Ano: "+this.ano); 
		System.out.println("Motor: "+this.motor);
	}
	
	
}

