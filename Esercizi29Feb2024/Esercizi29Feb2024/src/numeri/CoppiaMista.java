package numeri;

public class CoppiaMista<U, D> {

	private U uno;
	private D due;
	
	
	public void setGenericsMista(U uno, D due) {
		this.uno = uno;
		this.due = due;
	}
	
	public U getUnoMista() {
		return uno;
	}
	
	public D getDueMista() {
		return due;
	}
	
}
