package inputNumber;

import java.util.*;

public class InputNumber {

	public static void main(String[] args) {

		/*
		 * ESERCIZIO 1 Creare una classe Java che lasci inserire numeri in input
		 * all’utente finché la sequenza di numeri è decrescente, cioè l’ultimo elemento
		 * immesso dall’utente deve essere più piccolo del precedente. L’algoritmo alla
		 * fine deve stampare quanti numeri sono stati immessi e la loro media.
		 */
		Scanner scanner = new Scanner(System.in);
//		ArrayList<Integer> arrayNumeri = new ArrayList<Integer>();
//		System.out.println("Inserisci dei valori che siano minori dell'ultimo numero inserito");
//		while (scanner.hasNextInt()) {
//			int number = scanner.nextInt();
//
//			if (arrayNumeri.isEmpty() || arrayNumeri.get(arrayNumeri.size() - 1) > number) {
//				System.out.println("Inserito con successo");
//				arrayNumeri.add(number);
//			} else {
//				System.out.println("Numero inserito maggiore o uguale all'ultimo numero inserito.");
//				break;
//			}
//		}
//
//		System.out.println("Numeri inseriti:");
//		for (int numero : arrayNumeri) {
//			System.out.print(numero + " ");
//		}
//
//		int media = 0;
//		for (int numero : arrayNumeri) {
//			media += numero;
//		}
//		media /= arrayNumeri.size();
//
//		System.out.println(" media " + media);
//		System.out.println("Sono stati inseriti: " + arrayNumeri.size() + " numeri");

		/*
		 * ESERCIZIO 2 Creare una classe Java che chieda in input all’utente dei numeri
		 * che dovranno essere salvati in una lista. L’algoritmo deve stampare la lista
		 * dei numeri inseriti, il massimo e la media di tutti gli elementi
		 */

//		Scanner scanner2 = new Scanner(System.in);
//		List<Integer> arrayNumeri2 = new ArrayList<Integer>();
//
//		System.out.println("Inserisci dei valori ");
//
//		while (scanner.hasNextInt()) {
//			int number = scanner2.nextInt();
//			arrayNumeri2.add(number);
//			if (arrayNumeri2.get(arrayNumeri2.size() - 1) == 0) {
//				break;
//			}
//		}
//
//		System.out.println("Numeri inseriti:");
//		for (int numero : arrayNumeri2) {
//			System.out.print(numero + " ");
//		}
//
//		System.out.println();
//		int massimo = 0;
//		for (int numero : arrayNumeri2) {
//			if (numero > massimo) {
//				massimo = numero;
//			}
//
//		}
//		System.out.println("il numero massimo è: " + massimo);
//		System.out.println();
//
//		int somma = 0;
//		for (int numero : arrayNumeri2) {
//			somma += numero;
//		}
//		int media = somma / arrayNumeri2.size();
//
//		System.out.println("la media è: " + media);

		/*
		 * ESERCIZIO 5 Creare un’applicazione Java che chieda in input all’utente dei
		 * numeri positivi. L’acquisizione dei numeri da parte dell’utente finisce
		 * quando l’utente digita un numero negativo. Dopodiché, l’utente da in input un
		 * numero che chiameremo n. L’applicazione deve stampare a schermo due liste: •
		 * la lista dei numeri dati dall’utente, da cui vengono tolti i multipli di n. •
		 * La lista dei soli multipli di n
		 */

		Scanner scanner3 = new Scanner(System.in);
		Scanner scanner4 = new Scanner(System.in);
		ArrayList<Integer> arrayNumeriPositivi = new ArrayList<Integer>();
		ArrayList<Integer> arrayNumeriPositiviCopia = new ArrayList<>();
		ArrayList<Integer> arrayNumeriPositiviMultipli = new ArrayList<Integer>();
		System.out.println("Inserisci dei valori Positivi");

		while (scanner.hasNextInt()) {
			int number = scanner3.nextInt();
			arrayNumeriPositivi.add(number);
			if (number < 0) {
				break;
			}
		}
		
		
		System.out.println("Inserisci un valore per verificare i multipli");
		int n2 = scanner4.nextInt();
		
		for(int a: arrayNumeriPositivi) {
			if(a% n2 == 0) {
				arrayNumeriPositiviMultipli.add(a);
			}else {
				arrayNumeriPositiviCopia.add(a);
			}
				
		}
		
		arrayNumeriPositiviCopia.remove(arrayNumeriPositiviCopia.size()-1);
		arrayNumeriPositiviMultipli.remove(arrayNumeriPositiviMultipli.size()-1);
		
		System.out.println(arrayNumeriPositiviCopia);
		System.out.println(arrayNumeriPositiviMultipli);
	}
}
