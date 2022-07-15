package SubClasse;

import SuperClasse.Pessoa;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado() {
		
	}
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone);
		this.setCodigoSetor(codigoSetor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		return this.getSalarioBase()-this.getImposto();
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Codigo de setor:"+this.getCodigoSetor());
		System.out.println("Salario base:"+this.getSalarioBase());
		if (this.getImposto()>0) {
			System.out.println("Imposto cobrado:"+this.getImposto());
		}
		System.out.println("Salario do empregado:"+this.calcularSalario());
	}
}
