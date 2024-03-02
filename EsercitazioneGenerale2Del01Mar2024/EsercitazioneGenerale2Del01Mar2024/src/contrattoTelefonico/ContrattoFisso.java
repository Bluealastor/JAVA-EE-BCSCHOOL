package contrattoTelefonico;

public class ContrattoFisso extends ContrattoTelefonico {


	private String indirizzoUtente;
	
	
//	COSTRUTTORE
	
	public ContrattoFisso(String numero, String nomeAbbonato, int secondiChiamata, String abbonamento, String indirizzoUtente) {
		super(numero, nomeAbbonato, secondiChiamata, abbonamento);
		this.setIndirizzoUtente(indirizzoUtente);
	}
	
	
	
//	GETTER AND SETTER
	public String getIndirizzoUtente() {
		return indirizzoUtente;
	}

	public void setIndirizzoUtente(String indirizzoUtente) {
		this.indirizzoUtente = indirizzoUtente;
	}

	// METODI
	@Override
	public void Chiamata() {
		int costoChiamata = super.COSTO_AL_SECONDO * this.secondiChiamata;
		System.out.println("Il costo della chiamata è di:" + costoChiamata);
		
	}

	
	public void Chiamata(int secondiChiamata) {
		int costoChiamata = super.COSTO_AL_SECONDO * secondiChiamata;
		System.out.println("Il costo della chiamata è di:" + costoChiamata);
		
	}


}
