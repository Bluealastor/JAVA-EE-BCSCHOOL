package Lampadine;

public abstract class Elettricita {
	
	private static boolean corrente;
	
	public static boolean isCorrente() {
		return corrente;
	};
	
	public void setCorrente(boolean corrente) {
		this.corrente = corrente;
	}
	
	public abstract void switchCorrente();

}
