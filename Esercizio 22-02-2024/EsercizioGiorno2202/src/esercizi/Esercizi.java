package esercizi;

import java.util.Scanner;

public class Esercizi {
	
	static int[] numeri = { 1, 25, -4, 36, 0, -1, -4, 27, 3, -1, -1, 52 };
	static int[] arrayN = {1,3,5,-8};
	
	static Scanner input = new Scanner(System.in); 
	
	// MAIN
	public static void main(String[] args) {
		Esercizi esercizi = new Esercizi();
		// 	VERIFICA ESERCIZI
		System.out.println("ESERCIZIO3");
		esercizi.comparazione(4);
		System.out.println();
		
		System.out.println("ESERCIZIO4");
		esercizi.coincidenze(-4);
		System.out.println();
		
		System.out.println("ESERCIZIO5");
		esercizi.verificaNegativi();
		System.out.println();
		
		System.out.println("ESERCIZIO6");
		esercizi.sommaNumeriScelti();
		
	}

	// ESERCIZIO3
	static void comparazione(int n) {
		boolean verifica = false;
		for (int i = 0; i < numeri.length; i++) {
			if (n == numeri[i]) {
				verifica = true;
				break;
			}
		}
		if(verifica == true) {
			System.out.println("il numero esiste");
		}else {
			System.out.println("il numero non esiste");
		}
	}
	
	// ESERCIZIO4
	static void coincidenze(int x) {
		int esistenti = 0;
		for (int i = 0; i < numeri.length; i++) {
			if (x == numeri[i]) {
				esistenti++;
			}
		}
		if(esistenti > 0) {
		System.out.println("esiste " + esistenti +" volte");
		}else {System.out.println("il numero non esiste");}
	}
	
	//ESERCIZIO5
	static void verificaNegativi() {
		int[] array= new int[3];
		boolean negativoEsistente = false;
		System.out.println("Scegli 3 numeri");
		for (int i = 0; i < array.length; i++) {
				System.out.println("Inserisci il numero N " + (i + 1));
				array[i] = input.nextInt();
			}
//		
//		for (int i = 0; i < array.length; i++) {
//		System.out.println(array[i]);
//		}
		int negativo = array[0]; 
		for(int i = 0; i< array.length; i++) {
			if(negativo < array[i] && negativo < 0) {
				negativoEsistente = true;
			}
		}	

		
		if(negativoEsistente == true) {
			System.out.println("esiste un negativo");
		}else {
			System.out.println("non esiste un negativo");
		}
	}
	
	// ESERCIZIO6
	static void sommaNumeriScelti() {
		int[] numero = new int[3];
		System.out.println("Scegli 3 numeri");
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == 0) {
				System.out.println("Inserisci il numero N " + (i + 1));
				numero[i] = input.nextInt();
			}
		}
		System.out.println();
		int a = 0;
		System.out.println();
		for (int i = 0; i < numero.length; i++) {
			int num = a + numero[i];
			int num2 = numero[i] + numero[i];
			int somma2 = num + num2;
			System.out.println("la somma di = " + num + " + " + num2 + " è " + somma2);
		}
	}
}




