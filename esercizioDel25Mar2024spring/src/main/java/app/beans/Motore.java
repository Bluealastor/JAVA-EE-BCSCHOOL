package app.beans;

public class Motore {
	
	private String tipologiaMotore;
	
	private int cilindrata;

	public Motore() {
		super();
	}

	
	
	public Motore(String tipologiaMotore) {
		super();
		this.tipologiaMotore = tipologiaMotore;
	}
	
	

	public Motore(int cilindrata) {
		super();
		this.cilindrata = cilindrata;
	}



	public Motore(String tipologiaMotore, int cilindrata) {
		super();
		this.tipologiaMotore = tipologiaMotore;
		this.cilindrata = cilindrata;
	}

	public String getTipologiaMotore() {
		return tipologiaMotore;
	}

	public void setTipologiaMotore(String tipologiaMotore) {
		this.tipologiaMotore = tipologiaMotore;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Motore [tipologiaMotore= " + tipologiaMotore + ", cilindrata= " + cilindrata + "]";
	}
	
	

}
