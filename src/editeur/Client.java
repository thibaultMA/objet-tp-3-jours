package editeur;

public class Client {
    String nom;
    String prenom;
    String adresse;
    String cp;
    String ville;

    public Client(String nom,String prenom,String adresse,String cp,String ville) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
        this.setVille(ville);
        this.setCp(cp);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", adresse='").append(adresse).append('\'');
        sb.append(", cp='").append(cp).append('\'');
        sb.append(", ville='").append(ville).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
