package esercizi;

public class Telefono {
	private String numeroDiTelefono;
	private double creditoResiduo;
	private String[] cronologiaChiamate = new String[2];
	
	public Telefono(){
		
	}
	
	public String getNumeroDiTelefono() {
		return  this.numeroDiTelefono;
	}
	public void setNumeroDiTelefono(String numero){
		if(numero.length() > 0 && numero.length() <= 10) {
			this.numeroDiTelefono = numero;
			System.out.println("Inserimento Numero avvenuto con successo");
		}else if(numero.length() >= 11) {
		System.out.println("Hai inserito più di 10 numeri");
		}else {
			System.out.println("Non hai inserito numeri");
		}
	}
	public void getCreditoResiduo(){
			System.out.println("il tuo credito è di: " + this.creditoResiduo);

	}
	
	public void setCreditoResiduo(double credito) {
		this.creditoResiduo = credito;
	}
	
	public String[] getCronologiaChiamate() {
		return this.cronologiaChiamate;
	}
	
	public void setCronologiaChiamate(String[] chiamata) {
				this.cronologiaChiamate = chiamata;
		}

	
	public void chiamata(String numeroDachiamare) {
		if(this.creditoResiduo > 0){
			System.out.println("sto chiamando il numero: "+ numeroDachiamare);
			this.cronologiaChiamate[0] = numeroDachiamare;
			this.creditoResiduo--;
		}else {
			System.out.println("Mi dispiace credito esaurito Impossibile effettuare chiamate");
			this.cronologiaChiamate[1] = numeroDachiamare;
		}
	}
	
	public void creditoResiduo() {
		if(this.creditoResiduo > 0) {
			System.out.println("il tuo credito è di: " + this.creditoResiduo);
		}else {
			System.out.println("Non hai Credito");
		}
	}
	
	public void ultimaChiamataEffettuata() {
		System.out.println("L'ultimo numero con chiamata è: " + this.cronologiaChiamate[0]);
	}	
	
	public void richiama() {
		System.out.println("L'ultimo numero è: " +this.cronologiaChiamate[1]);
		this.creditoResiduo--;
	}
	
	public void ricaricaCredito(int credito) {
		if(credito <= 0) {
			System.out.println("Impossibile Impostare credito");
		}else {
			this.creditoResiduo = credito;
		}
	}
}
