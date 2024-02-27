package geometria;

public class Quadrato extends FiguraPiana {


	private int lato;
	
	
	public Quadrato(int altezza, int base) {
		super(altezza, base);
	}
	
	public Quadrato(){
		super();
	};
	
	public Quadrato(int lato){
		super();
		this.lato = lato;
	};
	
	public int getLato() {
		return lato;
	};
	
	public void setLato(int lato) {
		this.lato = lato;
	}

	
	@Override
	public int calcoloArea() {
		return lato * lato;
	};
	
	@Override
	public int calcoloPerimetro() {
		return lato * 4;
	};
}
