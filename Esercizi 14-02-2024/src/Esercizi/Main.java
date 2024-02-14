package Esercizi;

public class Main {

	public static void main(String[] args) {
		Esercizio esercizi = new Esercizio();
		Animale animale1 = new Animale("tigre", 4, "forestale");
		Automobile auto1 = new Automobile();
		Appartamento appartamento1 = new Appartamento("Roma", 1990, 120);
		
		
		// Esercizio1
		esercizi.esercizio1();
		// Esercizio2	
		System.out.println(esercizi.esercizio2(2,3));
		// Esercizio3
		esercizi.elenco("latte","pasta");		
		// Esercizio4
		esercizi.elencoCompatto("latte","pasta","nutella");		
		// Esercizio5
		esercizi.nome("Christian");
		
		// Esercizio6
		// Esercizio6.1
		animale1.animal();
		
		//Esercizio6.2
		auto1.modello = "Ferrari";
		auto1.anno = 2023;
		auto1.colore = "Rosso Ferrari";
		
		auto1.infoAutomobile();
		
		// Esercizio6.3
		appartamento1.infoAppartamento();
	}
}
