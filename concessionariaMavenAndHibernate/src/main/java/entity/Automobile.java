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
public class Automobile {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String marca;

	@Column
	private String modello;
	
	@Column
	private String targa;
	
	@Column
	private String numero_telaio;
	
	@Column
	private String trazione;

	public Automobile() {}
	
	public Automobile(String marca, String modello, String targa, String numero_telaio, String trazione) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.numero_telaio = numero_telaio;
		this.trazione = trazione;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getNumero_telaio() {
		return numero_telaio;
	}

	public void setNumero_telaio(String numero_telaio) {
		this.numero_telaio = numero_telaio;
	}

	public String getTrazione() {
		return trazione;
	}

	public void setTrazione(String trazione) {
		this.trazione = trazione;
	}

	@Override
	public String toString() {
		
		return "Automobile [id=" + id + ", marca=" + marca + ", modello=" + modello + ", targa=" + targa
				+ ", numero_telaio=" + numero_telaio + ", trazione=" + trazione + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
