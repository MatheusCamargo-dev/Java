package Main;

import java.util.Scanner;

import SubClasse.Carro;
import SubClasse.Onibus;
import SuperClasse.Automovel;

public class TestePolimorfismo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int op;
		Automovel auto = null;
		do {
			System.out.println("======MENU======");
			System.out.println("1-Cadastrar carro:");
			System.out.println("2-Cadastrar onibus:");
			System.out.println("3-Mostrar dados:");
			System.out.println("0-Sair");
			System.out.println("----------------");
			System.out.println("Digite uma opcao:");
			op=scan.nextInt();
			
			switch(op) {
				case 0:
					System.out.println("Saindo...");
					break;
				case 1:
					auto=new Carro("Ford","IMW-3432","Ka-7",3);
					break;
				case 2:
					auto=new Onibus("Mercedez","IQS-123","POA-GUAIBA");
					break;
				case 3:
					auto.imprimir();
					break;
				default:
					System.out.println("Informe uma opcao valida!");
			}
		}while(op!=0);
	}
}
