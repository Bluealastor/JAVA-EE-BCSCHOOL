package giorno19;

public class Persona {
	// parametri
	int eta;
	
	// costruttori
	public Persona() {};
	
	public Persona(int eta) {
		this.eta = eta;
	}
	
	// metodi
	public void verificaEta() {
		if(this.eta >= 18) {
			System.out.println("Sei maggiorenne");
		}else {
			System.out.println("Sei minorenne non puoi entrare");
		}
	}

}
