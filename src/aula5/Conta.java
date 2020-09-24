package aula5;

public class Conta {

	private int num, ag;
	private String dono;
	private double saldo;
	
	
	public void setNum(int num) {
		if(num > 0) {
			this.num = num;
		}else {
			System.out.println("O numero não pode ser negativo!");
		}
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public void imprimirDados() {
		System.out.println("Num: "+this.num);
		System.out.println("Agencia: "+this.ag);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Dono: "+this.dono);
	}
	
	public void imprimirNumConta() {
		System.out.println("Numero: "+this.num);
		
	}
	
	
}
