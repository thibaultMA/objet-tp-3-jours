package tp02.ex01;

public class Salarie extends Individu {
    private int salaire;

    public Salarie(String prenom, String nom, int salaire) {
        super(prenom, nom);
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString()+", salaire=" + getSalaire()+"€/mois";
    }

    public int getSalaire() {
        return salaire;
    }
}

