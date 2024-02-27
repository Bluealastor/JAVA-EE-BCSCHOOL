package geometria;

public class Triangolo extends FiguraPiana {
	
	int latoB;
	int latoA;
	
	public Triangolo(int altezza, int base,int latoA, int latoB) {
		super(altezza,base);
		this.latoA = latoA;
		this.latoB = latoB;
		
	}
	public Triangolo(){
		super();
	};
	public Triangolo(int altezza,int latoA, int latoB) {
		super(altezza);
		this.latoA = latoA;
		this.latoB = latoB;
	}
	
	
	
	
	@Override
	public int calcoloArea() {
		return (base * altezza) / 2; 
	};
	@Override
	public  int calcoloPerimetro() {
		return latoA + base + latoB;
	};
}
