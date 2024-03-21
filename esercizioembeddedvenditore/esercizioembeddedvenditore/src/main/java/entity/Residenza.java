package entity;

import javax.persistence.Embeddable;

@Embeddable
public class Residenza {
	
	
	private String indirizzo; 
	 private String cap;
	 private String città;
	
	 public Residenza() {
		super();
	}

	public Residenza(String indirizzo, String cap, String città) {
		super();
		this.indirizzo = indirizzo;
		this.cap = cap;
		this.città = città;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	@Override
	public String toString() {
		return "Residenza [indirizzo=" + indirizzo + ", cap=" + cap + ", città=" + città + "]";
	}
	 
	 
	 
}
