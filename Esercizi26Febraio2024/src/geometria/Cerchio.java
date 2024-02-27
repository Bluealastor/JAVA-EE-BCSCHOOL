package geometria;

public class Cerchio extends FiguraPiana{
	
	private int diametro;
	private int raggio;
	
	public Cerchio(int altezza, int base, int diametro, int raggio){
		super(altezza, base);
		this.diametro = diametro;
		this.raggio = raggio;
	}
	
	public Cerchio() {};
	
	public Cerchio(int diametro) {
		this.diametro = diametro;
	};

	
	public int getDiametro() {
		return this.diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	public int getRaggio() {
		return this.raggio;
	}
	
	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}
	
	@Override
	public int calcoloArea() {
		return (int) (super.PI_GRECO * ((diametro/ 2) * (diametro/ 2)));
	}
	
	@Override
	public int calcoloPerimetro() {
		return (int) (2* super.PI_GRECO) * raggio;
	}
}
