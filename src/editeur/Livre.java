package editeur;

public class Livre {
    String titre;
    String auteur;
    Integer prix;
    Integer nbPage;
    Long isbn;
    String Anne;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Livre{");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", nbPage=").append(nbPage);
        sb.append(", isbn=").append(isbn);
        sb.append(", Anné='").append(Anne).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Livre(Livre livre) {
        this.setTitre(livre.getTitre());
        this.setAuteur(livre.getAuteur());
        this.setPrix(livre.getPrix());
        this.setNbPage(livre.getNbPage());
        this.setAnne(livre.getAnne());
        this.setIsbn(livre.getIsbn());
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

    public String getAnne() {
        return Anne;
    }

    public void setAnne(String anne) {
        this.Anne = anne;
    }

    public Livre() {
    }

    public Livre(String titre, Integer nbPage, Long isbn) {
        this.titre = titre;
        this.nbPage = nbPage;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, Integer prix, Integer nbPage, Long isbn, String anne) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPage = nbPage;
        this.isbn = isbn;
        Anne = anne;
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
