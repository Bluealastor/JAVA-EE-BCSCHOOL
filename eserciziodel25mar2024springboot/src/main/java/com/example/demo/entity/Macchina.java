package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Macchina {
	
	private String modello;
	
	@Autowired
	private Motore motore;

	public Macchina() {
		super();
	}

	public Macchina(Motore motore) {
		super();
		this.motore = motore;
	}

	public Macchina(String modello, Motore motore) {
		super();
		this.modello = modello;
		this.motore = motore;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Motore getMotore() {
		return motore;
	}

	public void setMotore(Motore motore) {
		this.motore = motore;
	}

	@Override
	public String toString() {
		return "Macchina [modello=" + modello + ", motore=" + motore + "]";
	}
	
	
	
	
	

}
