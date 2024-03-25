package app.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Macchina {
	
	private String modello;
	
	private int numeroTelaio;
	
	private Motore motore;

	public Macchina() {
		super();
	}
	

	public Macchina(Motore motore) {
		super();
		this.motore = motore;
	}



	public Macchina(String modello, int numeroTelaio, Motore motore) {
		super();
		this.modello = modello;
		this.numeroTelaio = numeroTelaio;
		this.motore = motore;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getNumeroTelaio() {
		return numeroTelaio;
	}

	public void setNumeroTelaio(int numeroTelaio) {
		this.numeroTelaio = numeroTelaio;
	}

	public Motore getMotore() {
		return motore;
	}

	public void setMotore(Motore motore) {
		this.motore = motore;
	}

	@Override
	public String toString() {
		return "Macchina [modello= " + modello + ", numeroTelaio= " + numeroTelaio + ", motore= " + motore + "]";
	}
	
	
	

}
