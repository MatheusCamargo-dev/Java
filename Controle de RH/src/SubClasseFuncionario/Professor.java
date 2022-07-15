package SubClasseFuncionario;

import SubClasse.Funcionario;

public class Professor extends Funcionario{
	
	public Professor() {
		
	}
	
	public Professor(String nome, String sobrenome, double salario) {
		super(nome, sobrenome, salario);
	}
	
	public double salarioPrimeiraParcela() {
		return this.getSalario();
	}
	
	public double salarioSegundaParcela() {
		return 0;
	}
}
