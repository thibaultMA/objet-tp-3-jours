package tp02.ex02;

public class stagiaire extends Personne{
    private String dateNaissance;
    private String adresse;
    private String cp;

    public stagiaire(String nom, String prenom, String telephone, String dateNaissance, String adresse, String cp) {
        super(nom, prenom, telephone);
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.cp = cp;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("dateNaissance=").append(dateNaissance);
        sb.append(", adresse=").append(adresse);
        sb.append(", cp=").append(cp);
        return sb.toString();
    }
}
