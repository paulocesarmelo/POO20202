package aula4;

public class Endereco {

	String rua, lote, qd, bairro, estado, cidade, pais, cep;
	int num;
	
	
	public void alterarRua(String novaRua) {
		this.rua = novaRua;
	}
	
	public void imprimirDados() {
		System.out.println("Rua: "+this.rua);
		System.out.println("Num: "+this.num);
		System.out.println("Lote: "+this.lote);
		System.out.println("Quadra: "+this.qd);
		System.out.println("Bairro: "+this.bairro);
		System.out.println("CEP: "+this.cep);
		System.out.println("Cidade: "+this.cidade);
		System.out.println("Estado: "+this.estado);
		System.out.println("País: "+this.pais);
	}
	
}
