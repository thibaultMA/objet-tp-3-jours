package editeur;

public class Livre {
    String titre;
    String auteur;
    Integer prix;
    Integer nbPage;
    Long isbn;
    String Anné;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Livre{");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", nbPage=").append(nbPage);
        sb.append(", isbn=").append(isbn);
        sb.append(", Anné='").append(Anné).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getNbPage() {
        return nbPage;
    }

    public void setNbPage(Integer nbPage) {
        this.nbPage = nbPage;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getAnné() {
        return Anné;
    }

    public void setAnné(String anné) {
        Anné = anné;
    }

    public Livre() {
    }

    public Livre(String titre, Integer nbPage, Long isbn) {
        this.titre = titre;
        this.nbPage = nbPage;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, Integer prix, Integer nbPage, Long isbn, String anné) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPage = nbPage;
        this.isbn = isbn;
        Anné = anné;
    }

    public Livre(String titre, String auteur, Integer prix, Integer nbPage, Long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPage = nbPage;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, Integer nbPage, Long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPage = nbPage;
        this.isbn = isbn;
    }
}
