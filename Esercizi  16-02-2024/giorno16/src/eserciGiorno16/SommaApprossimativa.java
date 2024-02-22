package eserciGiorno16;

public class SommaApprossimativa {

	public static void main(String[] args) {
		
		System.out.println("La somma approssimativa dei 2 numeri è: " + sommaApprossimativa(2.1, 3.5));
	}
	
	static int sommaApprossimativa(double a, double b) {
		double sommaDouble = a + b;
		int sommaCastingDouble = (int) sommaDouble;
		
		return sommaCastingDouble;
	}
}
