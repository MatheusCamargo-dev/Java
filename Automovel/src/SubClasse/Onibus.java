package SubClasse;

import SuperClasse.Automovel;

public class Onibus extends Automovel{
	private String rota;
	
	public Onibus(String marca, String placa, String rota) {
		super(marca,placa);
		this.setRota(rota);
	}
	
	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Rota do ônibus"+this.getRota());
	}
}
