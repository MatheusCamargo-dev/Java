package SubClasse;

import SuperClasse.Pessoa;

public class PessoaFisica extends Pessoa{
		
	
	private String cpf;
	private String data_de_nascimento;

	
	public PessoaFisica(String nome) {
		super(nome);
	}
	public PessoaFisica(String nome, String cpf, String data_de_nascimento ){
		super(nome);
		this.setCpf(cpf);
		this.setData_de_nascimento(data_de_nascimento);
	}
	
	@Override
	public void imprimir() {
		System.out.println("Nome:"+this.getNome());
		System.out.println("CPF:"+this.getCpf());
		System.out.println("Data de nascimento:"+this.getData_de_nascimento());
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData_de_nascimento() {
		return data_de_nascimento;
	}

	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	
}
