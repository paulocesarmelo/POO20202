package aula6;

public class Carro extends Automovel{

	private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		
		System.out.println("Chassi: "+this.chassi);
		
		
	}
	
	
}


