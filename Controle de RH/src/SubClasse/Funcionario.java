package SubClasse;

import SuperClasse.Pessoa;

public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, String sobrenome, double salario) {
		super(nome, sobrenome);
		this.setSalario(salario);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double salarioPrimeiraParcela() {
		return (this.getSalario()*60)/100;
	}
	
	public double salarioSegundaParcela() {
		return (this.getSalario()*40)/100;
	}
	
	
}
