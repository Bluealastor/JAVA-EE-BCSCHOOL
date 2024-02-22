package eserciGiorno16;

public class Quadrato {
	int lato;

	public Quadrato() {};
	public Quadrato(int lato) {
		this.lato = lato;
	}
	
	public int perimetro() {
		return this.lato * 4;
	}
	
	public void areaQuadrato() {
		System.out.println("L'area è di: " + this.lato * this.lato);
	}

}
