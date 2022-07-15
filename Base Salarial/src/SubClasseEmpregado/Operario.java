package SubClasseEmpregado;

import SubClasse.Empregado;

public class Operario extends Empregado{
	private double valorProducao;
	private double comissao;
	private double porcentagem;
	
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setValorProducao(valorProducao);
		this.setComissao(comissao);
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = (this.getValorProducao()*comissao)/100;
		porcentagem = comissao;
	}
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	public double calcularSalario() {
		return this.getSalarioBase()+this.getComissao();
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor de producao:"+this.getValorProducao());
		System.out.println("Porcentagem da comissao:"+this.porcentagem+"%");
		System.out.println("Valor de comissao:"+this.getComissao());
	}
}
