package esercizi;

public class EsempioCellulare {
	public static void main(String[] args) {
		Telefono cellulare = new Telefono();
		cellulare.chiamata("2345678901");
		cellulare.creditoResiduo();
		System.out.println();
		cellulare.ricaricaCredito(5);
		
		cellulare.chiamata("2345678901");
		cellulare.creditoResiduo();
		cellulare.chiamata("2345678901");
		cellulare.creditoResiduo();
		cellulare.chiamata("2345678901");
		cellulare.creditoResiduo();
		cellulare.chiamata("2345678901");
		cellulare.chiamata("2345678900");
		cellulare.creditoResiduo();
		cellulare.chiamata("2345678901");
		cellulare.ricaricaCredito(5);
		cellulare.ultimaChiamataEffettuata();
		cellulare.richiama();
		
		
	}

}
