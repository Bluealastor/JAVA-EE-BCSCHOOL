package contrattoTelefonico;


public abstract class ContrattoTelefonico {
	

	private String numero;
	private String nomeAbbonato;
	final int COSTO_AL_SECONDO = 1;
	int secondiChiamata;
	private String abbonamento;
	
	// CONSTRUCTOR
	public ContrattoTelefonico(String numero, String nomeAbbonato, int secondiChiamata,String abbonamento) {
		this.setNumero(numero);
		this.setNomeAbbonato(nomeAbbonato);
		this.secondiChiamata = secondiChiamata;
		this.setAbbonamento(abbonamento);
	}
	
	
//	GETTER AND SETTER
	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNomeAbbonato() {
		return nomeAbbonato;
	}

	public void setNomeAbbonato(String nomeAbbonato) {
		this.nomeAbbonato = nomeAbbonato;
	}
	

	public String getAbbonamento() {
		return abbonamento;
	}


	public void setAbbonamento(String abbonamento) {
		this.abbonamento = abbonamento;
	}

	
	
	
//	 METODI
	public abstract void Chiamata();





}
