package Torrefazione;

public class MacchinettaDelCaffe {

	private int cialde;
	private int caffeCreati;
	private int massimoCialdeUsate;

	// CONSTRUCTOR
	MacchinettaDelCaffe() {
	}

	MacchinettaDelCaffe(int cialde) {
		this.cialde = cialde;
	}

	MacchinettaDelCaffe(int cialde, int massimoCialdeUsate) {
		this.cialde = cialde;
		this.massimoCialdeUsate = massimoCialdeUsate;
	}

	MacchinettaDelCaffe(int cialde, int caffeCreati, int massimoCialdeUsate) {
		this.cialde = cialde;
		this.caffeCreati = caffeCreati;
		this.massimoCialdeUsate = massimoCialdeUsate;
	}

	// GETTER AND SETTER

	public int getCialde() {
		return cialde;
	}

	public void setCialde(int cialde) {
		this.cialde = cialde;
	}


	public int getCaffeCreati() {
		return this.caffeCreati;
	}

	public void setCaffeCreati(int caffeCreati) {
		this.caffeCreati = caffeCreati;
	}

	public int getMassimoCialdeUsate() {
		return massimoCialdeUsate;
	}

	public void setMassimoCialdeUsate(int massimoCialdeUsate) {
		this.massimoCialdeUsate = massimoCialdeUsate;
	}

	// METODI

	public void faiCaffe() {
		
			if (getMassimoCialdeUsate() == 5) {
				System.out.println("svuotare cassetta cialde usate");
			} else {
				if (this.cialde > 0) {
					System.out.println("Caffe in corso");
					setCaffeCreati(getCaffeCreati() + 1);
					setMassimoCialdeUsate(getMassimoCialdeUsate() + 1);
					setCialde(getCialde()-1);

				} else {
					System.out.println("Mancano le cialde");
				}

			}

	}

	public void svuotaCialde() {
		if (getMassimoCialdeUsate() != 0) {
			System.out.println("cassetta cialde usate vuoto");
			setMassimoCialdeUsate(0);

		} else {
			System.out.println("puoi ancora creare caffe");
		}
	}
	
	
	public void caffèTotali(){
		System.out.println("Hai creato in totale: " + caffeCreati);
	}
	
	public void caffeDopoPulizia() {
		System.out.println("Hai creato: " + getMassimoCialdeUsate() + " dopo la pulizia delle cialde");
	}

	public void infoCassettaCialde() {
		System.out.println("puoi creare " + (5 - getMassimoCialdeUsate())  + " caffe prima di svuotare la cassetta");
	}




}
