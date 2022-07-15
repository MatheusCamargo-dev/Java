package SuperClasse;

public abstract class Pessoa {
	
	public Pessoa(String nome){
		this.setNome(nome);
	}
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void imprimir();
}
