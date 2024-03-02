package Corse;

import java.util.ArrayList;

public class TestGara {
    public static void main(String[] args) {
        Gara gara = new Gara("Monza");

        Auto auto1 = new Auto("Ferrari");
        Auto auto2 = new Auto("Red Bull");

        Pilota pilota1 = new Pilota("Michael Schumacher", auto1);
        Pilota pilota2 = new Pilota("Max Verstappen", auto2);

        ArrayList<Pilota> piloti = new ArrayList<>();
        piloti.add(pilota1);
        piloti.add(pilota2);

        ArrayList<Auto> auto = new ArrayList<>();
        auto.add(auto1);
        auto.add(auto2);

        gara.creaGrigliaDiPartenza(piloti, auto);

        Pilota vincitore = piloti.get(0); 
        gara.setVincitore(vincitore);
        gara.corriGara();
    }
}