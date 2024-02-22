package giorno20;

public class EserciziGiorno20 {
	int a;
	int b;
	int c;
	int d;

	// Costruttori
	EserciziGiorno20() {
	}

	EserciziGiorno20(int a) {
		this.a = a;
	}

	EserciziGiorno20(int a, int b) {
		this.a = a;
		this.b = b;
	}

	EserciziGiorno20(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	EserciziGiorno20(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	// Metodi
	// ESERCIZIO1
	public void verificaQuadrato(int a, int b, int c, int d) {
		if (a == b && b == c && c == d) {
			System.out.println("La figura è un quadrato");
		} else {
			System.out.println("La figura non ha tutti e 4 i lati uguali");
		}
	}

	// ESERCIZIO2
	public void verificaTriangolo(int a, int b, int c) {
		if (a == b && b == c) {
			System.out.println("La figura è Trinagolo equilatero");

		} else if (a == b && a != c && b != c) {
			System.out.println("La figura è Trinagolo isoscele");

		} else {
			System.out.println("La figura è Trinagolo scaleno");
		}
	}

//	ESERCIZIO3

	public void verificaRange(int a) {
		if (a >= -10 && a <= 10) {
			System.out.println("Il seguente numero che hai fornito" + " " + +a + " " + "è compreso tra -10 e 10 ed è ");
		} else {
			System.out.println("Errore");
		}
	}

//	ESERCIZIO4
	public void verificaLettera(String lettera) {
		if (lettera.length() == 1) {
			if (lettera == "a" || lettera == "e" || lettera == "i" || lettera == "o" || lettera == "u") {
				System.out.println("La lettera è una vocale");
			} else {
				System.out.println("La lettera è una consonante");
			}
		} else {
			System.out.println("Hai inserito troppe lettere rimuoveri le lettere in eccesso");
		}

	}

	// ESERCIZIO5
	public void cicloFor() {
		System.out.println("Ciclo FOR Crescente");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void cicloWhile() {
		System.out.println("Ciclo WHILE Crescente");
		int i = 0;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}

	// ESERCIZIO6
	public void cicloForSottrazione() {
		System.out.println("Ciclo FOR Decrescente");
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void cicloWhileSottrazione() {
		System.out.println("Ciclo WHILE Decrescente");
		int i = 10;
		while (i >= 0) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
	}

	// ESERCIZIO7
	public void numeriPariNegativiFor() {
		System.out.println("Ciclo FOR numeri Pari Negativi");
		for (int i = -10; i <= 0; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public void numeriPariNegativiWhile() {
		System.out.println("Ciclo WHILE numeri Pari Negativi");
		int i = -10;
		while(i <= 0) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}
	
	// ESERCIZIO8
	public void numeriDispariFor() {
		System.out.println("Ciclo FOR numeri Dispari");
		for (int i = -1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public void numeriDispariWhile() {
		System.out.println("Ciclo While numeri Dispari");
		int i = -1;
		while( i <= 20) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		i++;
		}
		System.out.println();
	}
	
	// ESERCIZIO9
	
	public void sommaFor10() {
		System.out.println("Ciclo FOR somma da 1 a 10");
        int a = 0;
        for (int i = 0; i <= 10; i++) {
        	System.out.print("la somma di = " + a +" + " + i + " è ");
        	 int somma = a += i;
        	System.out.print(somma);
        	System.out.println(); 
        }
        System.out.println();
        System.out.println("La somma da 1 a 10 è: " + a);
    }
	
	public void sommaWhile10() {
		System.out.println("Ciclo While somma da 1 a 10");
        int a = 0;
        int i = 0;
        while ( i <= 10) {
        	System.out.print("la somma di = " + a +" + " + i + " è ");
        	 int somma = a += i;
        	System.out.print(somma);
        	System.out.println(); 
        	i++;
        }
        
        System.out.println();
        System.out.println("La somma da 1 a 10 è: " + a);
    }
	
	// ESERCIZIO10
	public void tabellinaFor(int a) {
		System.out.println("Tabellina For");
		for (int i = 0; i <= a*10; i++) {
			int tabellina = a * i;
			if (tabellina % a%10 == 0 && tabellina <= a*10) {
				System.out.print(tabellina + " ");
			}
		}
		System.out.println();
	}
	
	public void tabellinaWhile(int a) {
		System.out.println("Tabellina while");
		int i = 0;
		while(i <= a*10) {
			int tabellina = a * i;
			if (tabellina % a%10 == 0 && tabellina <= a*10) {
				System.out.print(tabellina + " ");
			}
			i++;
		}
	}
	
	
	
}

