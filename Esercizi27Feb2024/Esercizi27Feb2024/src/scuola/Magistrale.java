package scuola;

class Magistrale extends Studente {
    public Magistrale(String nome, String cognome, double isee, int annoCorso) {
        super(nome, cognome, isee, annoCorso);
    }


    @Override
    public double calcoloTasse(Studente studente) {
        double tasse = super.calcoloTasse(studente);

        int anniFuoriCorso = Math.min(studente.annoCorso - 1, 2);
        tasse *= (1 + anniFuoriCorso * 0.15);
        return tasse;
    }
}
