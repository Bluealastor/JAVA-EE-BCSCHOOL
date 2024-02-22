package giorno20;

public class Main {
	public static void main(String[] args) {
		EserciziGiorno20 esercizi = new EserciziGiorno20(5, 5);

		System.out.println("ESERCIZIO1");
		esercizi.verificaQuadrato(1, 1, 1, 1);
		System.out.println("");

		System.out.println("ESERCIZIO2");
		esercizi.verificaTriangolo(3, 3, 4);
		System.out.println("");

		System.out.println("ESERCIZIO3");
		esercizi.verificaRange(20);
		System.out.println("");

		System.out.println("ESERCIZIO4");
		esercizi.verificaLettera("A");
		System.out.println("");

		System.out.println("ESERCIZIO5");
		esercizi.cicloFor();
		esercizi.cicloWhile();

		System.out.println("ESERCIZIO6");
		esercizi.cicloForSottrazione();
		System.out.println();
		esercizi.cicloWhileSottrazione();
		System.out.println();
		System.out.println("");

		System.out.println("ESERCIZIO7");
		esercizi.numeriPariNegativiFor();
		System.out.println();
		esercizi.numeriPariNegativiWhile();
		System.out.println();
		System.out.println("");

		System.out.println("ESERCIZIO8");

		esercizi.numeriDispariFor();
		System.out.println();
		esercizi.numeriDispariWhile();
		System.out.println();
		System.out.println("");
		
		System.out.println("ESERCIZIO9");
		esercizi.sommaFor10();
		System.out.println();
		esercizi.sommaWhile10();
		System.out.println();
		
		System.out.println("ESERCIZIO10");
		esercizi.tabellinaFor(5);
		System.out.println();
		esercizi.tabellinaWhile(8);
	}

}
