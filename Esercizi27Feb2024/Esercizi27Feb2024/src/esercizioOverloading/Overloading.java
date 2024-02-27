package esercizioOverloading;

public class Overloading {
	
	int a;
	int b;
	double c;
	String d;
	
	
	// OVERLOAD COSTRUTTORE
	public Overloading() {
		
	}
	public Overloading(int a, int b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public Overloading(int a,String d) {
		this.a = a;
		this.d = d;
	}
	public Overloading(double c, String d) {
		this.c = c;
		this.d = d;
	}
	
	// OVERLOAD METODO
	
	public void overLoad(int a) {
		System.out.println(a+a);
	};
	public void overLoad(int a, int b) {
		System.out.println(a+b);
	};
	
	public void overLoad(int a, double c) {
		System.out.println(a+c);
	};
	
	public void overLoad(int a, int b, double c) {
		System.out.println(a+b+c);
	};

}
