package giorno21;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizi21 {
	int a;
	Scanner input = new Scanner(System.in);

	
	
	Esercizi21(){};
	
	//Esercizio1
	public void esercizio1() {
		int[] array= new int[10];
		for(int i = 0; i<array.length; i++){
			
			System.out.print((array[i]=i )+ "");
		}
		System.out.println();
	};
	
	//Esercizio2
	
	public void numeriPari() {
		int[] array= new int[14];
		for(int i = 0; i<=12; i++){
			if(i%2 == 0) {
				System.out.print((array[i]=i )+ " ");
			}
			
			
		}
//		 Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
	};
	
	//Esercizio3
	public void numeriDisari() {
		int[] array= new int[14];
		for(int i = -3; i<=11; i++){
			if(i%2 == 1) {
				System.out.print((array[i]=i )+ " ");
			}
			
			
		}
//		 Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
	};
	
	//ESERCIZIO4
	public void paroleScelte(){
		String[] parola = new String[3];
	
		System.out.println("Scegli 3 parole(non possono essere sole, cuore o amore");
		for(int i = 0; i < parola.length; i++) {
			if(parola[i] == null) {
				System.out.println("Inserisci la parola N "+ (i+1));
				parola[i] = input.nextLine();
			}
			
		}
		System.out.println("Le parole scelte sono: " + parola[0] + ", "+ parola[1] + ", " + parola[2]);
		}
	
	// esercizio5
	public void inserimentoNumeri() {
		int[] numero = new int[3];
		System.out.println("Scegli 3 numeri");
		for(int i = 0; i < numero.length; i++) {
			if(numero[i] == 0) {
				System.out.println("Inserisci il numero N "+ (i+1));
				numero[i] = input.nextInt();
			}
		}
		System.out.println();
		for(int i = 0; i < numero.length; i++) {
	        if (numero[i] < 0) {
	            System.out.println("hai inserito un numero negativo "+ numero[i]);
	        }	
			}
		System.out.println();
		System.out.println("i numeri scelti sono: " + numero[0] + ", "+ numero[1] + ", " + numero[2]);

	};
	
	// esercizio6
	public void sommaNumeriScelti() {
		int[] numero = new int[3];
		System.out.println("Scegli 3 numeri");
		for(int i = 0; i < numero.length; i++) {
			if(numero[i] == 0) {
				System.out.println("Inserisci il numero N "+ (i+1));
				numero[i] = input.nextInt();
			}
		}
		System.out.println();
        int a = 0;
        System.out.println(); 
        for (int i = 0; i < numero.length; i++) {
        	int num = a+numero[i];
        	int num2 = numero[i]+numero[i];
        	int somma2= num + num2;
        	System.out.print("la somma di = " + num +" + " + num2 + " è ");
        	System.out.print(somma2);
        	System.out.println(); 
        }	
	}
	
	// esercizio6
	public void mediaNumeri() {
		int[] numero = new int[3];
		System.out.println("Scegli 3 numeri e calcoliamo la media");
		for(int i = 0; i < numero.length; i++) {
			if(numero[i] == 0) {
				System.out.println("Inserisci il numero N "+ (i+1));
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
	
	public void verificanumeroscelto() {
		int[] numero = new int[100];
		for(int i = 0; i < numero.length; i++) {
			numero[i]= i;
		}
		System.out.println("inserisci il numero dell' ordine e verifichiamo se lo abbiamo in magazzino");
		int numeroScelto = input.nextInt();
		for(int i = 0; i < numero.length; i++) {
			if(numero[i] == numeroScelto) {
				System.out.print("complimenti il numero  " + numeroScelto + 
						" che hai scelto si trova nel nostro database");
				break;
		}else {
			System.out.println("mi dispiace non è arrivato nel magazzino");
			break;
		}

	}
	
}
	
	
	public void verificaNumeroMaggiore() {
        int[] numeri = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci 3 numeri e vediamo il maggiore");
        for(int i = 0; i < numeri.length; i++) {
            System.out.println("Inserisci il numero " + (i + 1) + ": ");
            numeri[i] = input.nextInt();
        }

        int massimo = numeri[0];
        for(int j = 1; j < numeri.length; j++) {
            if(numeri[j] > massimo) {
                massimo = numeri[j];
            }
        }
        System.out.println("Il numero maggiore è: " + massimo);
    }
}