package Esercizi;

public class Esercizio {
	/*
	 * 1. Provare a far stampare a schermo una stringa a piacere al programma CiaoMondo al posto della stringa “Ciao Mondo!”.
	 * 2. Creare un programma che stampi la somma di due numeri.
	 * 3. Scrivere il programma Elenco che stampa la lista della spesa, dove ogni articolo da comprare risiede sul proprio rigo.
	 * 4. Scrivere il programma ElencoCompatto che stampa la lista della spesa, dove ogni articolo è separato da un altro con una virgola.
	 * 5. Scrivere un programma che visualizzi a schermo il vostro nome all’interno di un rettangolo, come nell’esempio seguente:
	 * 		+ - - - - - +
	 * 		| Prova     |
	 * 		+ - - - - - +
	 * 6. Creare delle classi scritte in Java, che contengono almeno 3 attributi per i seguenti oggetti del mondo reale.
	 * 		• Animale
	 * 		• Automobile
	 * 		• Appartamento
	 */
	// ESERCIZIO1
	public void esercizio1 () {
		System.out.println("Hello thi is the first exercises");
	}
	
	// ESERCIZIO2
	public int esercizio2(int a,int b) {
		return a+b;
	}
	
	// ESERCIZIO3
	public void elenco(String prodotto1, String prodotto2) {
		System.out.println("* " + prodotto1);
		System.out.println("* " + prodotto2);
	}
	
	// ESERCIZIO4
	public void elencoCompatto(String prodotto1, String prodotto2, String prodotto3 ) {
		System.out.print(prodotto1 + ", " + prodotto2 + ", " + prodotto3 + ", ");
		System.out.println();
	}

	
	// ESERCIZIO5 
	public void nome(String nome) {
		System.out.println("+ - - - - - +");
		System.out.println("| " + nome + " |");
		System.out.println("+ - - - - - +");
	}

}
