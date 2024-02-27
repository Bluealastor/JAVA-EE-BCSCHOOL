package scuola;

public class Main {
    public static void main(String[] args) {
        Studente[] studenti = new Studente[5];
        studenti[0] = new Triennale("Mario", "Rossi", 8000, 2);
        studenti[1] = new Magistrale("Luigi", "Bianchi", 15000, 3);
        studenti[2] = new Triennale("Giovanna", "Verdi", 20000, 4);
        studenti[3] = new Triennale("Carlo", "Neri", 35000, 1);
        studenti[4] = new Magistrale("Anna", "Gialli", 40000, 2);

        for (Studente studente : studenti) {
            double tasse = studente.calcoloTasse(studente);
            System.out.println(studente.nome + " " + studente.cognome + ": " + tasse + " euro");
        }
    }
}
