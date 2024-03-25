package app.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import app.beans.Macchina;
import app.beans.Motore;

@Configuration
public class Config {
	
	@Bean(name ="diesel")
	public Macchina macchinaDiesel(@Qualifier("diesel") Motore motore) {
		return new Macchina(motore);
	}
	@Bean
	public Macchina macchinaBenzina(@Qualifier("benzina") Motore motore) {
		return new Macchina(motore);
	}
	@Bean
	public Macchina macchinaElettrico(@Qualifier("elettrico") Motore motore) {
		return new Macchina(motore);
	}
	
	@Bean
	@Qualifier("diesel")
	public Motore motoreDiesel() {
		return new Motore("diesel");
	}
	
	@Bean
	@Qualifier("benzina")
	public Motore motoreBenzina() {
		return new Motore("benzina");
	}
	
	@Bean
	@Qualifier("elettrico")
	public Motore motoreElettrico() {
		return new Motore("elettrico");
	}

}
