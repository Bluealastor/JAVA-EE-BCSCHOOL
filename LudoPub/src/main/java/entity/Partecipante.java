package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Partecipante {
	
	@Id
	@Column(name = "id_partecipante")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private String cognome; 
	
	@Column
	private int età;
	
	@ManyToOne
	@JoinColumn(name = "fk_gioco", referencedColumnName = "nome_gioco")
	private GiocoDaTavola gioco;
	
	
	
	public Partecipante() {
		super();
	}

	public Partecipante(String nome, String cognome, int età) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
	}

	public Partecipante(int id, String nome, String cognome, int età, GiocoDaTavola gioco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
		this.gioco = gioco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}

	@Override
	public String toString() {
		return "Partecipanti [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", età=" + età + "]";
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
