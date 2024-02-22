package eserciGiorno16;

public class TestQuadrato {
	
	
	
	public static void main(String[] args) {
		 // istanze della classe Quadrato
		 Quadrato figura1 = new Quadrato(5);
		 Quadrato figura2 = new Quadrato(1);
		 Quadrato figura3 = new Quadrato(3);
		 Quadrato figura4 = new Quadrato(9);
		 
		 // Test 
		 System.out.println("Figura 1");
		 System.out.println("il perimetro è di: " + figura1.perimetro());
		 figura1.areaQuadrato();
		 System.out.println();
		 
		 System.out.println("Figura 2");
		 System.out.println("il perimetro è di: " + figura2.perimetro());
		 figura1.areaQuadrato();
		 System.out.println();
		 
		 System.out.println("Figura 3");
		 System.out.println("il perimetro è di: " + figura3.perimetro());
		 figura1.areaQuadrato();
		 System.out.println();
		 
		 System.out.println("Figura 4");
		 System.out.println("il perimetro è di: " + figura4.perimetro());
		 figura1.areaQuadrato();
		 System.out.println();
		 
	//	 Viaggio viaggio1 = new Viaggio("new York", 20, 5, "senza");
		 
	//	 viaggio.infoViaggio();
		 
		 
	}

}
