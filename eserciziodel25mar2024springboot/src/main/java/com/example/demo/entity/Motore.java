package com.example.demo.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Motore {
	
	private String tipologia;

	public Motore() {
		super();

	}

	public Motore(String tipologia) {
		super();
		this.tipologia = tipologia;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public String toString() {
		return "Motore [tipologia=" + tipologia + "]";
	}
	
	

}
