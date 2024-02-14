package Esercizi;

public class Appartamento {
	String luogo;
	int annoCostruzione;
	int metriQuadri;
	
	public Appartamento(String luogo, int annoCostruzione, int metriQuadri) {
		this.luogo = luogo;
		this.annoCostruzione = annoCostruzione;
		this.metriQuadri = metriQuadri;
	}; 

	
	public void infoAppartamento() {
		System.out.println("L'appartamento è a " + luogo + ", è di " + metriQuadri +" metri Quadri, " + " l'appartamento è del " + annoCostruzione );
	}

}
