package tp02.ex02;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String telephone;

    public Personne(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", telephone='").append(telephone).append('\'');

        return sb.toString();
    }
}
