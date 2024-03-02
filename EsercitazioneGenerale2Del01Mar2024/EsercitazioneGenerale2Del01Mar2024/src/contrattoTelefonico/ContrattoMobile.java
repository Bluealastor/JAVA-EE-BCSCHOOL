package contrattoTelefonico;

public class ContrattoMobile extends ContrattoTelefonico {


	final int SCATTO_ALLA_RISPOSTA = 2;
	
	
//	COSTRUTTORE

	public ContrattoMobile(String numero, String nomeAbbonato, int secondiChiamata, String abbonamento) {
		super(numero, nomeAbbonato, secondiChiamata, abbonamento);
		// TODO Auto-generated constructor stub
	}

	
//   METODI
	@Override
	public void Chiamata() {
		int costoChiamata = (super.COSTO_AL_SECONDO * secondiChiamata) + SCATTO_ALLA_RISPOSTA;
		System.out.println("Il costo della chiamata è di:" + costoChiamata);
		
	}
	
	public void Chiamata(int secondiChiamata) {
		int costoChiamata = (super.COSTO_AL_SECONDO * secondiChiamata) + SCATTO_ALLA_RISPOSTA;
		System.out.println("Il costo della chiamata è di:" + costoChiamata);
		
	}
	
}
