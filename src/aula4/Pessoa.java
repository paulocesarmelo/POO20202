package aula4;

public class Pessoa {

	static int  id = 0;
	String nome, cpf;
	int idade;
	Endereco endResidencial = new Endereco();
	//...
	
	public Pessoa() {
		
		id++;
		
		System.out.println("Criando objeto pessoa com id: "+id);
	}
	
	public void alterarId(int i) {
		id = i;
	}
	
	public void imprimirID() {
		System.out.println("Id: "+id);
	}
	
	public void alterarNome(String nome) {
		this.nome = nome;
	}
	
	public void alterarRuaPessoa(String novaRua) {
		this.endResidencial.alterarRua(novaRua);
	}
	
	public void verificarMaioridade() {
		if( this.idade >= 18) {
			System.out.println("É maior de idade\n");
		}else {
			System.out.println("É menor de idade!\n");
		}
	}
	
	//valida somente tamanho considerando . e -
	public void validarCPF() {
		
		if(this.cpf.length() == 14) {
			System.out.println("CPF é válido!\n");
		}else {
			System.out.println("CPF inválido!\n");
		}
		
	}
	
	public void imprimirDados() {
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
		System.out.println("Idade: "+idade);
		//EU NÃO QUERO IMPRIMIR O OBJETO EU QUERO IMPRIMIR OS ATRIBUTOS DO OBJETO
		//System.out.println("Endereço: "+endResidencial);
		this.endResidencial.imprimirDados();
	}
	
	
	
	
}
