package giorno19;

public class Esercizi {
	int a;
	int b;
	int c;
	
	public Esercizi(){};
	public Esercizi(int a){
		this.a = a;
	};
	public Esercizi(int a, int b){
		this.a = a;
		this.b = b;
		
	};
	public Esercizi(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		
	};

	
	// Esercizio2
	
	public void verificaNumeriPositivi() {
		if (a >= 1 ) {
			System.out.println("il numero é positivo");
		}else if(a <= -1 ){
			System.out.println("il numero è negativo");
		}else {
			System.out.println("il numero è neutrale");
		}
}
	// Esercizio3
		
	public void verificaNumeroMinore() {
			if(a < b) {
				System.out.println("Il numero minore dei due è: " + a);
			}else {
				System.out.println("Il numero minore dei due è: " + b);
			}
		};
		
//		Esercizio4
		
	public void verificaMaggiore() {
		if(a > b) {
			System.out.println("Il primo numero è maggiore");
		}else {
			System.out.println("Il primo numero non è maggiore");
		}
	}
	
//	Esercizio5
	
	public void  scalaMaggiori() {
		if(a<b && b<c) {
			System.out.println("i numeri sono in ordine crescente");
		}else {
			System.out.println("i numeri non sono in ordine crescente");
		}
	}
	
//	Esercizi06
	public void sommaMaggioreDi100() {
		if(a+b>100) {
			System.out.println("la somma è maggiore di 100");
		}else if(a+b == 100){
			System.out.println("la somma è uguale a 100");
		}else {
			System.out.println("la somma è minore di 100");
		}
	};
	
//	Esercizi07
	
	public void range() {
		if (a <= 10 && a >= 0) {
			System.out.println("il numero è compreso tra 0 e 10");
		}else {
			System.out.println("Errore");
		}
	};
	
	//Esercizio08
	
	public void verifica26() {
		if(a < 26) {
			System.out.println("il numero è minore di 26");
		}else if(a == 26) {
			System.out.println("il numero è uguale di 26");
		}else {
			System.out.println("il numero è maggiore di 26");
		}
	}
	

}
