package Main;

import SubClasse.Carro;
import SubClasse.Onibus;
import SuperClasse.Automovel;

public class PrincipalHeranca {
	public static void main (String args[]) {
		Automovel automovel = new Automovel("Fiat","IQP-2234");
		automovel.imprimir();
		
		Carro carro = new Carro("Ford","IMW-3432","Ka-7",3);
		carro.imprimir();
		
		Onibus onibus = new Onibus("Mercedez","IQS-123","POA-GUAIBA");
		onibus.imprimir();
		
	}
}
