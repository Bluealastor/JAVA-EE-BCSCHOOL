package numeri;

import java.util.*;

public class Esercizi {

	public static void main(String[] args) {

		// ESERCIZIO1
		/*
		 * Creare una classe Java che chieda all’utente di immettere dei numeri. Ogni
		 * numero deve essere inserito nella stessa lista. Alla fine stampare la lista.
		 */

		Scanner input = new Scanner(System.in);
		List<Integer> listaNumeri = new ArrayList<>();

		System.out.println(
				"Inserisci dei numeri e premire invio per l'inserimento il numero:  per terminare inserire una lettera");

		while (input.hasNextInt()) {
			int number = input.nextInt();
			listaNumeri.add(number);
		}

		System.out.println("Ecco l' ArrayList dei numeri inseriti:");
		System.out.println(listaNumeri);

//		ESERCIZIO2
		/*
		 * Creare una classe Java che chieda all’utente di immettere dei numeri. Ogni
		 * numero deve essere inserito nello stesso insieme. Alla fine stampare
		 * l’insieme.
		 */

		Scanner input2 = new Scanner(System.in);
		HashSet<Integer> hasSetNumeri = new HashSet<>();

		System.out.println(
				"Inserisci dei numeri e premire invio per l'inserimento il numero:  per terminare inserire una lettera");

		while (input2.hasNextInt()) {
			int number = input2.nextInt();
			hasSetNumeri.add(number);
		}

		System.out.println("Ecco l' HashSet dei numeri inseriti:");
		System.out.println(hasSetNumeri);

//	ESERCIZIO3

		/*
		 * Creare una classe Java che chieda all’utente di inserire 3 elementi
		 * chiave-valore in una mappa. La chiave deve essere di interi, il valore deve
		 * essere una stringa. Alla fine il programma deve chiedere all’utente di
		 * scegliere una delle chiavi e deve stamparne a schermo il valore.
		 * 
		 */

		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);
		Map<Integer, String> mapKeyValue = new HashMap<>();

		System.out.println(
				"Inserisci dei numeri e premire invio per l'inserimento il secondo valore inserire una stringa:  per terminare al Key inserire una lettera");
		System.out.println("inserire come primo un numero per la KEY");
		System.out.println("inserire come secondo una frase o sibolo per il VALUE");
		while (input3.hasNextInt()) {
			Integer key = input3.nextInt();
			System.out.println();

			String value = input4.nextLine();
			mapKeyValue.put(key, value);
		}
		
		System.out.println("Hai inserito tutti gli elementi");
		
		System.out.println("scegli una posizione tra quelle inseritedegli elementi");
		int a = input5.nextInt();
		System.out.println("il valore scelto è " +mapKeyValue.get(a));
		
		

//	ESERCIZIO6

		/*
		 * Creare una classe Java con una lista di Stringhe definita dal programmatore.
		 * Stampare a schermo la lista con una lambda
		 * 
		 */
		
		List<String> listaStringa = new ArrayList<String>();
		
		listaStringa.add("ciao");
		listaStringa.add("Mondo");
		listaStringa.add("Lorem");
		listaStringa.add("Ipsum");
		
		listaStringa.forEach( e -> System.out.println(e));

	}

}
