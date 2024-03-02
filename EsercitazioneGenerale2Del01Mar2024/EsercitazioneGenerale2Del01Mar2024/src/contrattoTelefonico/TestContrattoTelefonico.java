package contrattoTelefonico;

public class TestContrattoTelefonico {

	public static void main(String[] args) {

		ContrattoFisso utente1 = new ContrattoFisso("3241051", "Alessio", 13,"basso costo","via arturino");
		ContrattoMobile utente2 = new ContrattoMobile("21342135", "andrea", 12, "mobile");
		
		utente1.Chiamata();
		utente2.Chiamata();
		
		utente1.Chiamata(5);
		utente2.Chiamata(5);
		
		utente1.Chiamata(9);
		utente2.Chiamata(7);
	}
	
	
}
