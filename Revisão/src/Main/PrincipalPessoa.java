package Main;

import java.util.Scanner;

import SubClasse.PessoaFisica;
import SubClasse.PessoaJuridica;
import SuperClasse.Pessoa;

public class PrincipalPessoa{
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int op;
		int es;
		String nome;
		String cpf;
		String data_de_nascimento;
		int cnpj;
		int inscricao_estadual;
		String nome_fantasia;
		String razao_social;
		Pessoa auto = null;
		do {
			System.out.println("======MENU======");
			System.out.println("1-Cadastrar :");
			System.out.println("2-Imprimir:");
			System.out.println("0-sair");
			System.out.println("----------------");
			System.out.println("Digite uma opcao:");
			
			op=ler.nextInt();
			
			switch(op) {
				case 0:
					System.out.println("Saindo...");
					break;
				case 1:
					System.out.println("Voce eh uma pessoa FISICA ou JURIDICA[1/2]?");
					es=ler.nextInt();
					if(es==1) {
							ler.nextLine();
							System.out.println("Informe o seu nome:");
							nome=ler.nextLine();
							
							
							System.out.println("Informe o seu CPF:");
							cpf=ler.nextLine();
							
							System.out.println("Informe a sua data de nascimento:");
							data_de_nascimento=ler.nextLine();
							
							auto = new PessoaFisica(nome, cpf, data_de_nascimento);
					}
					else if(es==2){
							ler.nextLine();
							System.out.println("Informe o seu nome:");
							nome=ler.nextLine();
							
							
							System.out.println("Informe o seu CNPJ:");
							cnpj=ler.nextInt();
							
							System.out.println("Informe Inscricao Estadual:");
							inscricao_estadual=ler.nextInt();
							
							ler.nextLine();
							System.out.println("Informe nome fantasia:");
							nome_fantasia=ler.nextLine();
							
							System.out.println("Informe razao social:");
							razao_social=ler.nextLine();
							
							auto = new PessoaJuridica(nome, cnpj, inscricao_estadual, nome_fantasia,razao_social);
					}
					else {
							System.out.println("Informe uma opcao valida!");
					}
					break;
				case 2:
					if (auto==null){
						System.out.println("Nenhum valor cadastrado.");
					}
					else {
						auto.imprimir();
					}
					break;
				default:
					System.out.println("Informe uma opcao valida!");
			}
	 }while(op!=0);
	}
}
