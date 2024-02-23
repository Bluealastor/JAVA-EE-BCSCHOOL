package main;

public class Cerchio {
	
	// ESERCIZIO 6.b
/*
* Creare una classe Cerchio con una variabile di classe final chiamata PI_GRECO e che valga 3,14.
* Questa classe deve avere un metodo main con una variabile chiamata raggio che abbia un valore
* scelto dal programmatore e che stampi a schermo la circonferenza e l’area del cerchio. La classe
* deve avere un metodo che calcoli la circonferenza ed un altro metodo che calcoli l’area del
* cerchio.
*/
	
	 static final double PI_GRECO= 3.14;
	 
	 public static void main(String[] args) {
		 int raggio = 5;
		 calcoloCirconferenzaCerchio(raggio);
		 calcoloAreaCerchio(raggio);
	 }
	 
	 static void calcoloCirconferenzaCerchio(int a) {
		 double circonferenza = ( 2 * PI_GRECO) * a;
		 System.out.println("la circonferenza del cerchio è di " + circonferenza);
	 }
	 
	 static void calcoloAreaCerchio(int a) {
		 double area = PI_GRECO * (a*a);
		 System.out.println("l' aria del cerchio è di " + area);
	 }

}
