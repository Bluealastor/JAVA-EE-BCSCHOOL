package main;

import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// ESERCIZIO 1.b
		System.out.println("ESERCIZIO 1.b");
		System.out.println();
		
		System.out.println("somma " +somma(2,4));
		System.out.println("sottrazione " +sottrazione(2,4));
		System.out.println("moltiplicazione " +moltiplicazione(2,4));
		System.out.println("divisione " +divisione(4,2));
		
		System.out.println();
		
		
		// ESERCIZIO 2.b
		System.out.println("ESERCIZIO 2.b");
		System.out.println();
		
		numeriPariFor();
		numeriPariWhile();
		System.out.println();
		
		// ESERCIZIO 3.b
		System.out.println("ESERCIZIO 3.b");
		System.out.println();
		
		numeriDispariFor();
		numeriDispariWhile();
		
		System.out.println();
		
		// ESERCIZIO 4.b
		System.out.println("ESERCIZIO 4.b");
		 tabellineDa1a10();
		 
		 
		 
		 
		// ESERCIZIO 7.b
		System.out.println("ESERCIZIO 7.b");	 
		 arrayVariabile();
		
	}
	
	// ESERCIZIO 1.b
/*	
 * Scrivere una classe che abbia un metodo main e altri 4 metodi: uno per la somma, uno per la
 * sottrazione, uno per la moltiplicazione e uno per la divisione tra due numeri.
 * Ognuno di questi metodi deve restituire il risultato dell’operazione.
 * Inserire nel main delle stampe dei risultati come esempio.
*/
	
	public static int somma(int a, int b) {
		return a+b;
	}
	
	public static int sottrazione(int a, int b) {
		return a-b;
	}
	public static int moltiplicazione(int a, int b) {
		return a*b;
	}
	public static int divisione(int a, int b) {
		return a/b;
	}
	
	// ESERCIZIO 2.b
	
	/*
	 * Crea una classe Java che stampi a schermo i numeri pari da 1 a 14. 
	 * Utilizza sia un ciclo while, siaun ciclo for.
	*/
	
	public static void numeriPariFor() {
		System.out.println("Ciclo for");
		for(int i = 1; i<= 14; i++) {
			if(i% 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void numeriPariWhile() {
		System.out.println("Ciclo while");
		int i = 1;
		while(i<= 14) {
			if(i% 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}
	
	
	// ESERCIZIO 3.b
	/*
	 * Creare una classe Java che stampi a schermo i numeri dispari da 14 a -3. 
	 * Utilizza sia un while che un ciclo for.
	 * 
	*/
	
	
	public static void numeriDispariFor() {
		System.out.println("Ciclo for");
		for(int i = 14; i >= -3; i--) {
			if(i% 2 == 1 || i% 2 == -1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static void numeriDispariWhile() {
		System.out.println("Ciclo while");
		int i = 14;
		while(i >= -3) {
			if(i% 2 == 1 || i% 2 == -1) {
				System.out.print(i + " ");
			}
			 i--;
		}
		System.out.println();
	}
	
	
	// ESERCIZIO 4.b
	/*
	 * Creare una classe Java che stampi a schermo le tabelline dei numeri da 1 a 10.
	 * Es.: 1*1 = 1, 1*2 = 2, …
	 * 2*1 = 2, 2*2 = 4, …
	*/
	
	public static void tabellineDa1a10() {
		for(int i = 1; i<=10; i++) {
			System.out.println("la tebbellina del " + i + " ");
			for(int j = 1; j<=10; j++) {
				System.out.print( i + "*"+ j + " = " + (i*j) + ", ");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	// ESERCIZIO 7.b
	
/*
 *Creare una classe Java che chieda all’utente quanti elementi intende inserire,
 *poi acquisisca in input quel numero di elementi, che saranno numeri interi. 
 *Una volta fatto questo, si chieda all’utente di scegliere un indice dell’array.
 *Si scambi di posto il massimo tra gli elementi dell’array e l’elemento con l’indice deciso 
 *dall’utente, scrivendo anche un messaggio quando le due posizioni coincidono.
 
*/
	
	public static void arrayVariabile() {
		
		int[] arrayVariabile;
		System.out.println("inserisci il numero di elementi dell'array");
		int numeroElementiArray = input.nextInt();
		arrayVariabile = new int[numeroElementiArray];
		System.out.println("inserisci i numeri all'interno dell'array");
		for(int i = 0; i<arrayVariabile.length; i++) {
			System.out.println("inserisci l'elemento N " + (i + 1));
			arrayVariabile[i] = input.nextInt();
		}
		System.out.println("Hai inserito tutti gli elementi");
		for(int i = 0; i<arrayVariabile.length; i++) {
			System.out.println(arrayVariabile[i]);
		}
		
		System.out.println();
		
		System.out.println("scegli la posizione dell'elemento e se sarà maggiore lo sostiuirà partendo");
		int posizioneArray = input.nextInt();
		
//		arrayVariabile[posizioneArray];
		System.out.println("scegli il tuo un numero");
		int numeroScelto = input.nextInt();
		System.out.println("il numero dell'array che hai selezionato è "+ arrayVariabile[posizioneArray]);
		System.out.println("il numero scelto da te è: "+ numeroScelto);
		if (  numeroScelto > arrayVariabile[posizioneArray]) {
			System.out.println("Il numero scelto è maggiore e sostituirà il numero dell'array");
			arrayVariabile[posizioneArray] = numeroScelto;
		}else if (arrayVariabile[posizioneArray] == numeroScelto ){
			System.out.println("i numeri sono uguali");
		}else {
			System.out.println("il tuo numero è troppo piccolo e non sostiuirà l'elemento dell' array");
		}
		
		for(int i = 0; i<arrayVariabile.length; i++) {
			System.out.println(arrayVariabile[i]);
		}
		System.out.println();

	}
	
}
