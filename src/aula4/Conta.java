package aula4;

public class Conta {

	int num, ag;
	String dono;
	double saldo;
	
	public Conta(int num){
		
		if(num > 0 ) {
			this.num = num;
		}else {
			System.out.println("O numero não pode ser negativo");
		}
	}
	
	public void definirAgencia(int ag) {
		this.ag = ag;
	}
	
	public void imprimirDados() {
		System.out.println("Num: "+this.num);
		System.out.println("Agencia: "+this.ag);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Dono: "+this.dono);
	}
	
	
}
