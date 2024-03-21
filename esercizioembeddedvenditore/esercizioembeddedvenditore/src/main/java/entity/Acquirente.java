package entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Acquirente {
	
	
	@Id
	 private String codiceFiscale; 
	 
	 private String nome;
	 
	 private String cognome;
	 
	 private String tel;
	 
	 @Embedded
	 private Residenza residenza;
	 
	 @ManyToOne
	 @JoinColumn(name = "id_ordine", referencedColumnName = "id")
	 private Ordine ordine;
	 
	 

	 
	 
	public Acquirente() {
		super();
	}

	public Acquirente(String codiceFiscale, String nome, String cognome, String tel) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.tel = tel;
	}

	public Acquirente(String codiceFiscale, String nome, String cognome, String tel, Residenza residenza) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.tel = tel;
		this.residenza = residenza;
	}

	public Acquirente(String codiceFiscale, String nome, String cognome, String tel, Residenza residenza,
			Ordine ordine) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.tel = tel;
		this.residenza = residenza;
		this.ordine = ordine;
	}


	public Acquirente(String codiceFiscale, String nome, String cognome, String tel, Ordine ordine) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.tel = tel;
		this.ordine = ordine;
	}
	

	public Acquirente(String codiceFiscale, String nome, String cognome,Residenza residenza ,String tel) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.tel = tel;
		this.residenza = residenza;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Residenza getResidenza() {
		return residenza;
	}

	public void setResidenza(Residenza residenza) {
		this.residenza = residenza;
	}

	@Override
	public String toString() {
		return "Acquirente [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", tel=" + tel
				+ ", residenza=" + residenza + "]";
	}
	 
	 
	 
	 
	 
	 
	 
	 
}
