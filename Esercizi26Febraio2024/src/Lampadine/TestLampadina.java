package Lampadine;

public class TestLampadina {

	public static void main(String[] args) {
		Lampadina lampadina1 = new Lampadina(5);
		Interruttore interruttore1 = new Interruttore(lampadina1);
		Interruttore interruttore2 = new Interruttore(lampadina1);

		System.out.println(lampadina1.getTotaleUso());
		
		System.out.println();
		System.out.println("Interrutore 2");
		interruttore2.switchCorrente();
		interruttore2.switchLampadina();
		System.out.println();
		interruttore1.switchLampadina();

		
		System.out.println();System.out.println();
		System.out.println();
		System.out.println("lampadina e interruttore 1");
		lampadina1.switchCorrente();
		interruttore1.switchLampadina();
		interruttore2.switchLampadina();
		System.out.println();
		
		lampadina1.switchCorrente();

		interruttore2.switchLampadina();
		System.out.println();
		System.out.println("ciao");
		interruttore2.switchLampadina();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
