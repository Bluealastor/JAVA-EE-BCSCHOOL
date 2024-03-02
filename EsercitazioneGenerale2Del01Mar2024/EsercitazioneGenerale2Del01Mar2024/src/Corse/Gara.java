package Corse;

import java.util.ArrayList;
import java.util.HashMap;

public class Gara {

	    private String circuito;
	    private Pilota vincitore;
	    private HashMap<Pilota, Auto> grigliaDiPartenza;
	    
	    public void setVincitore(Pilota pilotaVincitore) {
	        this.vincitore = pilotaVincitore;
	    }

	    public Gara(String circuito) {
	        this.circuito = circuito;
	        this.grigliaDiPartenza = new HashMap<>();
	    }

	    public void creaGrigliaDiPartenza(ArrayList<Pilota> piloti, ArrayList<Auto> auto) {
	        if (piloti.size() != auto.size()) {
	            System.out.println("Errore: Il numero di piloti e auto non corrisponde.");
	            return;
	        }

	        for (int i = 0; i < piloti.size(); i++) {
	            grigliaDiPartenza.put(piloti.get(i), auto.get(i));
	        }
	    }

	    public void corriGara() {

	        Auto autoDelVincitore = grigliaDiPartenza.get(vincitore);

	        System.out.println("Il pilota vincente è: " + vincitore.getNomePiloti());
	        System.out.println("Guidava l'auto della scuderia: " + autoDelVincitore.getScuderia());
	    }
	
	
}
