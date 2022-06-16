package tp04.ex01;

public class Emplacement {
    private int couleur;
    private int xCentre;
    private int yCentre;

    protected Emplacement(int couleur, int xCentre, int yCentre) {
        this.setCouleur(couleur);
        this.setxCentre(xCentre);
        this.setyCentre(yCentre);
    }

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public int getxCentre() {
        return xCentre;
    }

    public void setxCentre(int xCentre) {
        this.xCentre = xCentre;
    }

    public int getyCentre() {
        return yCentre;
    }

    public void setyCentre(int yCentre) {
        this.yCentre = yCentre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("couleur=").append(couleur);
        sb.append(", xCentre=").append(xCentre);
        sb.append(", yCentre=").append(yCentre);

        return sb.toString();
    }
}
