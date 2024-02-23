package main;

import java.util.Scanner;

public class Media {
	
// ESERCIZIO 5.b
	
	/*
	 *Creare una classe Media con il metodo main 
	 *che stampi a schermo il calcolo della media tra 3
	 *numeri, chiamando un metodo apposito. 
	*/

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		mediaNumeri();
		
	}
	
	public static void mediaNumeri() {

		int[] numero = new int[3];
		System.out.println("Scegli 3 numeri e calcoliamo la media");
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == 0) {
				System.out.println("Inserisci il numero N " + (i + 1));
				numero[i] = input.nextInt();
			}
		}
		System.out.println();
		int somma = 0;
		for (int i = 0; i < numero.length; i++) {
			somma += numero[i];
		}
		int media = somma / numero.length;
		System.out.println("La media degli elementi dell'array è: " + media);
	}

	
	
}
