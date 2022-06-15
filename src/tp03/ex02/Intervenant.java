package tp03.ex02;

public class Intervenant {
    String nom;
    double TauxHauraire;

    public Intervenant(String nom, double tauxHauraire) {
        this.nom = nom;
        TauxHauraire = tauxHauraire;
    }

    public double getTauxHauraire() {
        return TauxHauraire;
    }

}
