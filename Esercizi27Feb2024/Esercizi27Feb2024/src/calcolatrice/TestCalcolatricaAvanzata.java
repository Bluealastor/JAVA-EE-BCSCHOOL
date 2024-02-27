package calcolatrice;

import java.util.Scanner;

public class TestCalcolatricaAvanzata {

	static String scelta1;
	static String scelta2;


	public static void main(String[] args) {
		CalcolatriceAvanzata();
	}

	static CalcolatriceAvanzata calcola = new CalcolatriceAvanzata();

	public static void CalcolatriceAvanzata() {
		
		System.out.println("SOMMA");
		double[] a = {30,2,20};
		System.out.println(calcola.somma(1,3));
		System.out.println(calcola.somma(1,3,5));
		System.out.println(calcola.somma(a));
			
		
		
		
		System.out.println("SOTTRAZIONE");
		System.out.println(calcola.sottrazione(1,3));
		System.out.println(calcola.sottrazione(1,3,10));
		System.out.println(calcola.sottrazione(a));
		
		
		System.out.println("Moltiplicazione");
		System.out.println(calcola.moltiplicazione(3,1));
		System.out.println(calcola.moltiplicazione(1, 5, 7));
		System.out.println(calcola.moltiplicazione(a));
		
		
		System.out.println("Divisione");
		System.out.println(calcola.divisione(3,1));
		System.out.println(calcola.divisione(3,1,8));
		System.out.println(calcola.divisione(a));
		
		}

	}

