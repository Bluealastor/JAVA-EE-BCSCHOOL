package eccezioni;

import java.util.*;

public class Esercizi {

	public static void main(String[] args) {

		// ESERCIZIO1
		/*
		 * Creare una classe Java con un metodo main dove si provi a dividere un numero
		 * per 0, gestendo l’eccezione risultante con un messaggio di errore
		 * appropriato.
		 */
		int a = 5;
		int b = 0;

		try {
			int c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Impossibile dividere per 0");
		}

//		ESERCIZIO2
		/*
		 * Creare una classe Java con un metodo main nel quale ci sia un cast di un
		 * oggetto da int a String. Gestire l’eccezione risultante con un messaggio di
		 * errore appropriato. Nota: per poter compilare senza errori, è necessario fare
		 * una variabile int con un valore, poi una variabile di tipo Object a cui si
		 * assegna il cast ad Object della variabile di interi e poi un System.out di un
		 * cast a String della variabile di tipo Object.
		 */

		int numero = 42;
		Object ogetto = (Object) numero;
		try {
			String castInt = (String) ogetto;
		} catch (ClassCastException e) {
			System.out.println("Errore: Impossibile eseguire il cast da int a String.");
		}

//		ESRCIZIO3
		/*
		 * 
		 * Creare una classe Java con un metodo main che chieda l’immissione di un
		 * numero double. Gestire l’eccezione risultante dall’immissione di un carattere
		 * non numerico mostrando un messaggio di errore appropriato.
		 * 
		 */
	    Scanner scanner = new Scanner(System.in);
        double doub = 0;


            try {
                System.out.print("Inserisci un numero double: ");
                doub = scanner.nextDouble();
              
            } catch (InputMismatchException e) {
                System.out.println("Errore: Inserisci un numero valido.");
                scanner.next();
            }
            
            System.out.println("il tuo numero è " + doub);
            scanner.close();
		
		
		
		

//		ESERCIZIO4
		/*
		 * Creare una classe Java con un metodo main che preveda la stampa dei primi 5
		 * elementi di una array di interi. Qualora l’array avesse meno di 5 elementi,
		 * gestire l’eccezione mostrando un messaggio di errore appropriato
		 * 
		 */
            
            
            int[] array1 = {1,2,3,4,5};
            int[] array2 = {1,2,3};
            
            try {
                for(int i = 0; i <= 4; i++) {
                	System.out.print(array2[i] + " ");
                }
            }catch(ArrayIndexOutOfBoundsException m) {
            	System.out.println("ERRORE ");
            	System.out.println("Inserire almeno 5 elementi nell'array");
            }

            

	}

}
