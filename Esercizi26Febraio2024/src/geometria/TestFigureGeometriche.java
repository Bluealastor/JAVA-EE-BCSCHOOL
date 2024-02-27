package geometria;

public class TestFigureGeometriche {
	
	public static void main(String[] args) {
		Cerchio cerchio1 = new Cerchio();
		Quadrato quadrato1 = new Quadrato(5);
		Triangolo triangolo1 = new Triangolo(4,5,6);
		
		
		// FiguraCerchio
		cerchio1.setDiametro(2);
		cerchio1.setRaggio(8);
		System.out.println("Area Cerchio1 " + cerchio1.calcoloArea() );
		System.out.println("Perimetro Cerchio1 " + cerchio1.calcoloPerimetro());
		
		System.out.println();
		
//		FiguraQuadrato
		System.out.println("Area quadrato1 " +quadrato1.calcoloArea());
		System.out.println("Perimetro quadrato1 " + quadrato1.calcoloPerimetro());
		
		System.out.println();
		
		
		//FiguraTriangolo1
		System.out.println("Perimetro Cerchio1 " + triangolo1.calcoloPerimetro());
		
		System.out.println("Area Cerchio1 senza parametro del EXTENDS " + triangolo1.calcoloArea());
		//PASSAGGIO DEL DATO BASE
		triangolo1.base = 3;
		System.out.println("Area Cerchio1 con PARAMETRO PASSATO ALLA CLASSE ABSTRACT " + triangolo1.calcoloArea());
		
	}

}
