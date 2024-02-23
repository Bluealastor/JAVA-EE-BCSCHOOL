package main;

public class TestAutomobile {
	
	public static void main(String[] args) {
		Automobile auto = new Automobile();
		Automobile auto2 = new Automobile();
		
		System.out.println("AUTO 1");
		auto.mostraCarburante();
		auto.setLitriPerChilometro(100);
		auto.viaggio(21);
		auto.mostraChilometriPercorsi();
		
		System.out.println();
		
		System.out.println("AUTO 2");
		auto2.rifornimentoCarburante(20);
		auto2.mostraCarburante();
		auto2.setLitriPerChilometro(10);
		auto2.viaggio(2000);
		auto2.mostraCarburante();
		auto2.mostraChilometriPercorsi();
		
		System.out.println();
		
		auto2.rifornimentoCarburante(20);
		auto2.mostraCarburante();
		auto2.setLitriPerChilometro(20);
		auto2.viaggio(100);
		auto2.mostraCarburante();
		auto2.mostraChilometriPercorsi();
		
		
	}

}
