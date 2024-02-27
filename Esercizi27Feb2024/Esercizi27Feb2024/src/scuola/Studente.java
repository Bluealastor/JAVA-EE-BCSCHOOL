package scuola;

class Studente {
    public String nome;
    public String cognome;
    public double isee;
    public int annoCorso;

    public Studente(String nome, String cognome, double isee, int annoCorso) {
        this.nome = nome;
        this.cognome = cognome;
        this.isee = isee;
        this.annoCorso = annoCorso;
    }

    // Metodi
    public double calcoloTasse(Studente studente) {
        double tasse = 0;
        if (studente.isee < 10000) {
            tasse = 500;
        } else if (studente.isee < 30000) {
            tasse = 700;
        } else {
            tasse = 1200;
        }

        int anniFuoriCorso = Math.min(studente.annoCorso - 1, 3);
        tasse *= (1 + anniFuoriCorso * 0.1);
        return tasse;
    }
}
