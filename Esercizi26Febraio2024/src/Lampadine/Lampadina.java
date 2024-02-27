package Lampadine;

public class Lampadina extends Elettricita{

	//Possibilità di usare enum per una corretta scelta di stato
	/*
	 *enum statoLampadina{
	 *ACCESO,
	 *SPENTO,
	 *ROTTA}
	 *
	*/
	private boolean statoLampadina = false;
	private boolean rotta = false;
	
	private int totaleUso;

	
	
	// COSNTRUCTOR
	public Lampadina() {
	};

	public Lampadina(boolean statoLampadina, int totaleUso, boolean rotta) {
		this.statoLampadina = statoLampadina;
		this.totaleUso = totaleUso;
		this.rotta = rotta;
	};
	public Lampadina(int totaleUso) {
		this.totaleUso = totaleUso;
	};
	
	// GETTER AND SETTER
	public boolean setStatoLampadina(boolean statoLampadina) {
		return this.statoLampadina = statoLampadina;
	}
	
	public boolean isStatoLampadina() {
		return this.statoLampadina;
	}
	
	public int getTotaleUso() {
		return this.totaleUso;
	}
	
	public void setTotaleUso(int totaleUso) {
		this.totaleUso = totaleUso;
	}
	public boolean isRotta() {
		return this.rotta;
	}
	public void setRotta() {
		this.rotta = !rotta;
	}
	
	@Override
	public void switchCorrente() {
		super.setCorrente(!super.isCorrente());
		System.out.println("corrente Lampadina " + super.isCorrente());
	}
	
	public void stato() {
		if (totaleUso == 0) {
			System.out.println(" lo lampadina è rotta ");
		} else {
			System.out.println("la lampadina può ancora essere utilizzata " + totaleUso);
		}
	};

	public void click() {
		if(Elettricita.isCorrente() == true) {
			System.out.println("C'è corrente");
			if(totaleUso!=0) {
					if(statoLampadina == true) {
						System.out.println( "lampadina accesa" );
						totaleUso--;
					}else {
						System.out.println( "lampadina spenta");
						}
				
			}else {
				System.out.println( "lampadina rotta");
			}
		}else {System.out.println("Non c'è corrente");}


	}

}
