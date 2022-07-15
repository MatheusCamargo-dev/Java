package SuperClasse;

public class Automovel {
	private String marca;
	private String placa;
	
	public Automovel(String marca, String placa) {
		this.setMarca(marca);
		this.setPlaca(placa);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void imprimir() {
		System.out.println("Marca:"+this.getMarca());
		System.out.println("Placa:"+this.getPlaca());
	}
	
	
}
