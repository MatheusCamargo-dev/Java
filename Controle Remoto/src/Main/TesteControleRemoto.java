package Main;

public class TesteControleRemoto {
	public static void main (String Args[]) {
		ControleRemoto controle = new ControleRemoto();
		controle.ligar();
		controle.abrirMenu();
		controle.fecharMenu();
		controle.maisVolume();
		controle.maisVolume();
		controle.abrirMenu();
		controle.ligarMudo();
		controle.abrirMenu();
		controle.desligarMudo();
		controle.abrirMenu();
	}
}
