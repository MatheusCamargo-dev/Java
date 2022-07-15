package SubClasse;

import SuperClasse.Pessoa;

public class PessoaJuridica extends Pessoa{
	
	private int cnpj;
	private int inscricao_estadual;
	private String nome_fantasia;
	private String razao_social;
	

	public PessoaJuridica(String nome) {
		super(nome);
	}
	public PessoaJuridica(String nome, int cnpj, int inscricao_estadual, String nome_fantasia, String razao_social){
		super(nome);
		this.setCnpj(cnpj);
		this.setInscricao_estadual(inscricao_estadual);
		this.setNome_fantasia(nome_fantasia);
		this.setRazao_social(razao_social);
	}

	@Override
	public void imprimir() {
		System.out.println("Nome:"+this.getNome());
		System.out.println("CNPJ:"+this.getCnpj());
		System.out.println("Nome Fantasia:"+this.getNome_fantasia());
		System.out.println("Razao Social:"+this.getRazao_social());
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getInscricao_estadual() {
		return inscricao_estadual;
	}

	public void setInscricao_estadual(int inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

}
