package main;

public class Automobile {

	// ATTRIBUTI
	private int carburante;
	private int chilometri;
	private int chilometriPercorsiTotali;
	private int litriSerbatoio;
	private int litriPerChilometro;
	
	// COSTRUTTORI
	public Automobile(){}
	public Automobile(int carburante,int Chilometri,int litriSerbatoio){
		this.carburante = carburante;
		this.chilometri = chilometri;
		this.litriSerbatoio = litriSerbatoio;
		this.chilometriPercorsiTotali = chilometriPercorsiTotali;
	}
	
	// METODI GET E SETTER
	public double getCarburante() {
		return this.carburante;
	}
	public void setCarburante(double carburante) {
		if(carburante > 20) {
			System.out.println("Mi dispiace oltre i 20L non puoi inserire");
			this.carburante = 20;
		}
	}
	
	public int getChilometri() {
		return this.chilometri;
	}
	
	public void setChilometri(int k) {
		this.chilometri = k;
	}
	
	public int getChilometriPercorsiTotali() {
		return this.chilometriPercorsiTotali;
	}
	public void setChilometriPercorsiTotali(int kT) {
		chilometriPercorsiTotali = kT ;
	}
	
	public int getLitriPerChilometro() {
		return this.litriPerChilometro;
	}
	
	public void setLitriPerChilometro(int lPK) {
		this.litriPerChilometro = lPK;
	}
	
	// METODI
	
	public void mostraCarburante() {
		System.out.println("il carburante nel serbatorio è di " + carburante + "L");
	}
	
	public void rifornimentoCarburante(int c) {
		carburante = c;
	}
	
	public void mostraChilometriPercorsi() {
		System.out.println("i chilometri totali percorsi sono: " + this.chilometriPercorsiTotali);
	}
	
	public void viaggio(int k) {
		int chilometriPercorribili = ( litriPerChilometro * carburante);
		int carbSpeso = k / litriPerChilometro;
		int carbRimasto =  carburante - carbSpeso;



		if(carburante > 0) {
		if(chilometriPercorribili < k) {
			System.out.println(carburante);
			System.out.println("i chilometri da percorrere sono troppi");
			System.out.println("ti consigliamo di sostarti per rifornimento carburante");
			rifornimentoCarburante(20);
			
			chilometriPercorsiTotali = k;

			
		}else {
			this.carburante = carbRimasto;
			System.out.println("Buon viaggio");
			System.out.println("Sei arrivato a destinazione");
			chilometriPercorsiTotali = k;
			
			
		}
		}else {
			System.out.println("Prima di partire fare rifornimento");
		}
		

	}
	
	
	
}
