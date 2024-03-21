package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ordine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String dataRichiesta;
	private double prezzoTotale; 
	private int numeroArticoli;
	
	@OneToMany(mappedBy = "ordine")
	private List<Acquirente> acquirente;
	
	
	
	public Ordine() {
		super();
	}

	public Ordine(String dataRichiesta, double prezzoTotale, int numeroArticoli) {
		super();
		this.dataRichiesta = dataRichiesta;
		this.prezzoTotale = prezzoTotale;
		this.numeroArticoli = numeroArticoli;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataRichiesta() {
		return dataRichiesta;
	}

	public void setDataRichiesta(String dataRichiesta) {
		this.dataRichiesta = dataRichiesta;
	}

	public double getPrezzoTotale() {
		return prezzoTotale;
	}

	public void setPrezzoTotale(double prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}

	public int getNumeroArticoli() {
		return numeroArticoli;
	}

	public void setNumeroArticoli(int numeroArticoli) {
		this.numeroArticoli = numeroArticoli;
	}

	@Override
	public String toString() {
		return "Ordine [id=" + id + ", dataRichiesta=" + dataRichiesta + ", prezzoTotale=" + prezzoTotale
				+ ", numeroArticoli=" + numeroArticoli + "]";
	}
	
	
	
	
	
	

}
