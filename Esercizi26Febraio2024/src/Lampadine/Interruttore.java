package Lampadine;

public class Interruttore extends Elettricita{
	
	boolean switchInterruttore;
	String colore;
	String modello;
	Lampadina lampadina;
	
	public Interruttore() {
		
	}
	public Interruttore(String colore, String modello) {
		this.colore = colore;
		this.modello = modello;
	}
	public Interruttore(String colore) {
		this.colore = colore;
		
	}
	
	public Interruttore(Lampadina lampadina) {
		this.lampadina = lampadina;
	}
	
	
	@Override
	public void switchCorrente() {
		super.setCorrente(!super.isCorrente());
		System.out.println("corrente interruttore " + super.isCorrente());
	}

	public void switchLampadina() {
		System.out.println("interruttore Lampadina");
		if(super.isCorrente()== true) {
			lampadina.setStatoLampadina(!lampadina.isStatoLampadina());
			lampadina.click();

		}else if(super.isCorrente() == false) {
			System.out.println("manca la corrente " + super.isCorrente());
		}
	}
	

}
