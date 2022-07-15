package Main;

import SubClasse.Funcionario;
import SubClasseFuncionario.Professor;
import SuperClasse.Pessoa;

public class UsaPessoa {
	public static void main(String Args[]) {
		Pessoa pessoa1 = new Pessoa("Mario","Lopes");
		Funcionario pessoa2 = new Funcionario("Lucas","Mendes",2000);
		Professor pessoa3 = new Professor("Rafael","Lira",1000);
		System.out.println(pessoa1.nomeCompleto());
		System.out.println(pessoa2.nomeCompleto());
		System.out.println(pessoa3.nomeCompleto());
		System.out.println("Primeira parcela de funcionario:"+pessoa2.salarioPrimeiraParcela());
		System.out.println("Segunda parcela de funcionario:"+pessoa2.salarioSegundaParcela());
		System.out.println("Primeira parcela do professor:"+pessoa3.salarioPrimeiraParcela());
		System.out.println("Segunda parcela do professor:"+pessoa3.salarioSegundaParcela());
		
	}
}
