package Main;

import SubClasse.Empregado;
import SubClasse.Fornecedor;
import SubClasseEmpregado.Administrador;
import SubClasseEmpregado.Operario;
import SubClasseEmpregado.Vendedor;

public class TesteBaseSalarial {
	public static void main(String Args[]) {
		Fornecedor fornecedor = new Fornecedor("Paulo","Porto Alegre","(51)996612548",10000,5000);
		fornecedor.imprimirDados();
		System.out.println("============================================");
		Empregado empregado = new Empregado("Julia","Guaiba","(51)99999999",15,1000,5);
		empregado.imprimirDados();
		System.out.println("============================================");
		Administrador administrador = new Administrador("Julio","Guaiba","(51)99999999",15,1000,0,100);
		administrador.imprimirDados();
		System.out.println("============================================");
		Operario operario = new Operario("Edilson","Eldorado","(51)99887744",77,1000,0,1000,50);
		operario.imprimirDados();
		System.out.println("============================================");
		Vendedor vendedor = new Vendedor("Claudio","Sao Paulo","(11)88661248",100,1000,0,1000,50);
		vendedor.imprimirDados();
	}
}
