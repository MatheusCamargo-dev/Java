package Main;

public class ControleRemoto implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	private int volume_mudo;
	

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		
	}
	
	public int getVolume_mudo() {
		return volume_mudo;
	}

	public void setVolume_mudo(int volume_mudo) {
		this.volume_mudo = volume_mudo;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isTocando() {
		return tocando;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		String on_off;
		if (this.isLigado()==true) {
			on_off=("On");
		}
		else {
			on_off=("Off");
		}
		System.out.println("=--------Menu--------=");
		System.out.println("On/Off:"+on_off);
		System.out.println("Tocando:"+this.isTocando());
		System.out.println("Volume:"+this.getVolume());
		for (int i=0; i < this.getVolume();i+=10) {
			System.out.print("|");
		}
		System.out.println("");
	}
	
	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu..");
		
	}
	

	@Override
	public void maisVolume() {
		if (this.isLigado()==true && this.getVolume()<100) {
			
				this.setVolume(this.getVolume()+5);		
		}
	}

	@Override
	public void menosVolume() {
		if(this.isLigado()==true && this.getVolume()>0) {
			this.setVolume(this.getVolume()-5);
		}	
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado()==true && this.getVolume()>0) {
			this.setVolume_mudo(this.getVolume());
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado()==true && this.getVolume()==0) {
			this.setVolume(this.getVolume_mudo());
		}
	}

	@Override
	public void play() {
		if (this.isLigado()==true && !(this.isTocando()==true)) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.isLigado()==true && (this.isTocando()==true)) {
			this.setTocando(false);
		}
	}	
	
}
