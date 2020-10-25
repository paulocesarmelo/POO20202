package aula6;

public class Automovel {
	
	private String marca, cor, modelo;
	private int ano;
	private Motor motor;
	
	public Automovel() {}
	
	public Automovel(String marca, String cor, String modelo, int ano, Motor motor) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.motor = motor;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void imprimirDados() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Ano: "+this.ano);
		System.out.println("Cor: "+this.cor);
	}
	
}
