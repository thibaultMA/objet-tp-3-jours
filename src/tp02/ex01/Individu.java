package tp02.ex01;

public class Individu {
    private String prenom;
    private String nom;
    public Individu(String prenom, String nom) { //
        this.nom = nom;
        this.prenom = prenom;
    }



    @Override
    public String toString() {
        return "prénom=" + getPrenom()+", nom=" + getNom();
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }
}
