package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Persona {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@Column
	private String indirizzo;
	
	@Column
	private String professione;
	
	@Column
	private Integer eta;
	
	public Persona() {};

	public Persona(Integer id, String nome, String cognome, String indirizzo, String professione, Integer eta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.professione = professione;
		this.eta = eta;
	}

	public Persona(String nome, String cognome, String indirizzo, String professione, Integer eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.professione = professione;
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo
				+ ", professione=" + professione + ", eta=" + eta + "]";
	}
	
	
	
	
	
	
	
}
