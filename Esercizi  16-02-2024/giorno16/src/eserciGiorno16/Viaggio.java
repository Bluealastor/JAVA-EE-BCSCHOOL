package eserciGiorno16;

public class Viaggio {
	String nomeLocalita;
	int durataViaggio;
	char stelle = '*';
	int stelleHotel;
	String pensione;
	
	// COSTRUTTORI
	public Viaggio() {}
	
	public Viaggio(String nomeLocalita,int durataViaggio, int stelleHotel, String pensione) {
		this.nomeLocalita = nomeLocalita;
		this.durataViaggio = durataViaggio;
		this.stelleHotel = stelleHotel;
		this.pensione = pensione;
	}
	
	public void infoViaggio() {
		System.out.println("Il vostro viaggio sarà ad: " + this.nomeLocalita + " durerà tot " + this.durataViaggio + " giorni" + " L' Hotel avrà "+ stelleHotel + stelle + " " +  pensione + " pensione");
	}
}
