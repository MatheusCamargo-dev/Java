package SubClasseEmpregado;

import SubClasse.Empregado;

public class Vendedor extends Empregado{
	private double valorVendas;
	private double comissao;
	private double porcentagem;
	
	public Vendedor() {
		
	}
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setValorVendas(valorVendas);
		this.setComissao(comissao);
	}
	
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = (this.getValorVendas()*comissao)/100;
		porcentagem = comissao;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double calcularSalario() {
		return this.getSalarioBase()+this.getComissao();
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor de vendas:"+this.getValorVendas());
		System.out.println("Porcentagem da comissao:"+this.porcentagem+"%");
		System.out.println("Comissao: "+this.getComissao());
	}
	
}
