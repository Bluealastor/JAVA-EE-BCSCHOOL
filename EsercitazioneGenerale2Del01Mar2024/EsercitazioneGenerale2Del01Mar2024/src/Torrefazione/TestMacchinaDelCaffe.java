package Torrefazione;

public class TestMacchinaDelCaffe {
	
	public static void main(String[] args) {
		
		MacchinettaDelCaffe caffettiera1 =new MacchinettaDelCaffe();
		
		caffettiera1.setCialde(3);
		caffettiera1.faiCaffe();
		caffettiera1.faiCaffe();
		caffettiera1.faiCaffe();
		caffettiera1.infoCassettaCialde();
		caffettiera1.faiCaffe();
		caffettiera1.svuotaCialde();
		caffettiera1.faiCaffe();
		caffettiera1.setCialde(4);
		caffettiera1.faiCaffe();
		caffettiera1.faiCaffe();
		caffettiera1.faiCaffe();
		caffettiera1.faiCaffe();
		caffettiera1.caffèTotali();
		caffettiera1.caffeDopoPulizia();
		caffettiera1.infoCassettaCialde();
		
	}

}
