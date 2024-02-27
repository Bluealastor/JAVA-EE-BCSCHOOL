package geometria;

public abstract class FiguraPiana {
	
	public final float PI_GRECO = 3.14f;
	public int altezza;
	public int base;

	public FiguraPiana(int altezza, int base) {
		this.altezza = altezza;
		this.base = base;
	}
	public FiguraPiana(int altezza) {
		this.altezza = altezza;

	}
	public FiguraPiana() {};
	// METODI
	public abstract int calcoloArea();
	public abstract int calcoloPerimetro();
}
