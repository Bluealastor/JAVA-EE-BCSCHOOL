package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class GiocoDaTavola {

	
	@Id
	@Column(name = "nome_gioco")
	private String nome;
	
	@Column(name = "casa_produttrice")
	private String casaProduttrice;
	
	@Column(name = "numero_min_giocatori")
	private Integer numeroMinGiocatori;
	
	@Column(name = "numero_max_giocatori")
	private Integer numeroMaxGiocatori;
	

	@Column
	private int etaMinima;
	
	@OneToMany(mappedBy = "gioco")
	private List<Partecipante> registroPartecipanti;

	
	public GiocoDaTavola() {
		super();
	}


	public GiocoDaTavola(String nome, String casaProduttrice, Integer numeroMinGiocatori, Integer numeroMaxGiocatori,
			int etaMinima) {
		super();
		this.nome = nome;
		this.casaProduttrice = casaProduttrice;
		this.numeroMinGiocatori = numeroMinGiocatori;
		this.numeroMaxGiocatori = numeroMaxGiocatori;
		this.etaMinima = etaMinima;
	}


	public GiocoDaTavola(String nome, String casaProduttrice, Integer numeroMinGiocatori, Integer numeroMaxGiocatori,
			int etaMinima, List<Partecipante> registroPartecipanti) {
		this.nome = nome;
		this.casaProduttrice = casaProduttrice;
		this.numeroMinGiocatori = numeroMinGiocatori;
		this.numeroMaxGiocatori = numeroMaxGiocatori;
		this.etaMinima = etaMinima;
		this.registroPartecipanti = registroPartecipanti;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCasaProduttrice() {
		return casaProduttrice;
	}


	public void setCasaProduttrice(String casaProduttrice) {
		this.casaProduttrice = casaProduttrice;
	}


	public Integer getNumeroMinGiocatori() {
		return numeroMinGiocatori;
	}


	public void setNumeroMinGiocatori(Integer numeroMinGiocatori) {
		this.numeroMinGiocatori = numeroMinGiocatori;
	}


	public Integer getNumeroMaxGiocatori() {
		return numeroMaxGiocatori;
	}


	public void setNumeroMaxGiocatori(Integer numeroMaxGiocatori) {
		this.numeroMaxGiocatori = numeroMaxGiocatori;
	}


	public int getEtaMinima() {
		return etaMinima;
	}


	public void setEtaMinima(int etaMinima) {
		this.etaMinima = etaMinima;
	}

	public List<Partecipante> getRegistroPartecipanti() {
		return registroPartecipanti;
	}


	public void setRegistroPartecipanti(List<Partecipante> registroPartecipanti) {
		this.registroPartecipanti = registroPartecipanti;
	}


	@Override
	public String toString() {
		return "GiocoDaTavola [nome=" + nome + ", casaProduttrice=" + casaProduttrice + ", numeroMinGiocatori="
				+ numeroMinGiocatori + ", numeroMaxGiocatori=" + numeroMaxGiocatori + ", etaMinima=" + etaMinima + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
