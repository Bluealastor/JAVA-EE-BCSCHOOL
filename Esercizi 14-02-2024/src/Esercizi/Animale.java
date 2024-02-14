package Esercizi;

public class Animale {
	String razza;
	int numeroZampe;
	String habitat;
	
	public Animale(String razza, int numeroZampe, String habitat) {
		this.razza = razza;
		this.numeroZampe = numeroZampe;
		this.habitat = habitat;
	}
	
	public void animal() {
		System.out.println("L'animale è una " + razza + " ha " + numeroZampe + " zampe" + " vine in Habitat " + habitat);
	}
	
}
