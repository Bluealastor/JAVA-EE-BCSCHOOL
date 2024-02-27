package calcolatrice;

public class CalcolatriceAvanzata {

	
//	public int somma(int a, int b) {
//		return a+b;
//	}
	
	public int somma(double a, double b) {
		return (int) (a+b);
	}
	
	public int somma(double a, double b, double c) {
		return (int) (a+b+c);
	}
	
	public double somma(double[] a) {
		double somma = 0;
		for(int i = 0; i< a.length; i++) {
			somma += a[i];
		}
		return somma;
	}
	
	
	
//	public int sottrazione(int a, int b) {
//		return a-b;
//	}
	
	public int sottrazione(double a, double b) {
		return (int) (a-b);
	}
	
	public int sottrazione(double a, double b, double c) {
		return (int) (a-b-c);
	}
	
	public double sottrazione(double[] a) {
		double sottrazione = a[0];
		for(int i = 1; i<a.length; i++) {
			sottrazione -= a[i];
		}
		return sottrazione;
	}
	
	
	
//	public int moltiplicazione(int a, int b) {
//		return a*b;
//	}
	
	public int moltiplicazione(double a, double b) {
		return (int)(a*b);
	}
	
	public int moltiplicazione(double a, double b, double c) {
		return (int)(a*b*c);
	}
	
	public double moltiplicazione(double[] a) {
		double moltiplicazione = a[0];
		for(int i = 1; i<a.length; i++) {
			moltiplicazione *= a[i];
		}
		return moltiplicazione;
	}
	
	
	
//	public int divisione(int a, int b) {
//		return a/b;
//	}
	public int divisione(double a, double b) {
		return (int)(a/b);
	}
	public int divisione(double a, double b, double c) {
		return (int)(a/b/c);
	}
	
	public double divisione(double[] a) {
		double divisione = a[0];
		for(int i = 1; i<a.length; i++) {
			divisione /= a[i];
		}
		return divisione;
	}

}
