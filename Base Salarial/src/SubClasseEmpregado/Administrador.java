package SubClasseEmpregado;

import SubClasse.Empregado;

public class Administrador extends Empregado{
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.setAjudaDeCusto(ajudaDeCusto);
	}
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double calcularSalario() {
		return this.getSalarioBase()+this.getAjudaDeCusto();
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Ajuda de custo: "+this.getAjudaDeCusto());
	}
	
}
