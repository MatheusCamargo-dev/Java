package SubClasse;

import SuperClasse.Automovel;

public class Carro extends Automovel{
	
	private String modelo;
	private int qtdPortas;
	
	public Carro(String marca, String placa, String modelo, int qtdPortas) {
		super (marca, placa);
		this.setModelo(modelo);
		this.setQtdPortas(qtdPortas);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Modelo:"+this.getModelo());
		System.out.println("Quantidade de portas:"+this.getQtdPortas());
	}
	
}
