package giorno19;

public class Main {
	
	public static void main(String[] args) {
		// istanze Classi
		Persona persona1 = new Persona(10);
		Esercizi esercizi = new Esercizi(27,2,1);
		
		
//		Verifica Esercizi1
		persona1.verificaEta();
		
		esercizi.verificaNumeriPositivi();
		esercizi.verificaNumeroMinore();
		esercizi.verificaMaggiore();
		esercizi.scalaMaggiori();
		esercizi.sommaMaggioreDi100();
		esercizi.range();
		esercizi.verifica26();
	}

}
