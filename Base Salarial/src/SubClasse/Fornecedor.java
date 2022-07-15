package SubClasse;

import SuperClasse.Pessoa;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor() {
		
	}
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
		
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return this.getValorCredito()-this.getValorDivida();
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Valor de credito:"+this.getValorCredito());
		System.out.println("Valor de divida:"+this.getValorDivida());
		System.out.println("Saldo do fornecedor:"+this.obterSaldo());
	}
	
}
