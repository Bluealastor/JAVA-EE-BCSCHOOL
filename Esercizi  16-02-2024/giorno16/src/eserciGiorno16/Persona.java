package eserciGiorno16;

public class Persona {
	
	String nome;
	String cognome;
	
	// Costruttori
	public Persona() {
		
	}
	
	public static void main(String[] args) {
		
		generalita("Christian", "Esposito");
		
	}
	
	static void generalita(String nome, String cognome) {
		System.out.println("mi chiamo " + nome + " " + cognome);
	};

	
}
