package tp03.ex01;

import java.awt.*;

public class Voiture {
    private long numSerie;
    private String imatriculation;
    private String marque;
    private Color couleur;
    private int anne;
    private Proprietaire proprietaire;

    public Voiture(long numSerie, String imatriculation, String marque, Color couleur, int anne) {
        this.numSerie = numSerie;
        this.imatriculation = imatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.anne = anne;
    }


    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }

    public String getImatriculation() {
        return imatriculation;
    }

    public void setImatriculation(String imatriculation) {
        this.imatriculation = imatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getAnne() {
        return anne;
    }

    public void setAnne(int anne) {
        this.anne = anne;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Voiture{");
        sb.append("numSerie=").append(numSerie);
        sb.append(", imatriculation='").append(imatriculation).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", couleur=").append(couleur);
        sb.append(", anne=").append(anne);
        sb.append(", proprietaire=").append(proprietaire);
        sb.append('}');
        return sb.toString();
    }
}
