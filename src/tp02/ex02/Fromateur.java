package tp02.ex02;

import java.time.LocalDate;

public class Fromateur extends Personne{
    int numIntervenant;
    LocalDate dateCreatiion;
    int nbIntervenant;

    public Fromateur(String nom, String prenom, String telephone, int numIntervenant, LocalDate dateCreatiion, int nbIntervenant) {
        super(nom, prenom, telephone);
        this.numIntervenant = numIntervenant;
        this.dateCreatiion = dateCreatiion;
        this.nbIntervenant = nbIntervenant;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(super.toString());
        sb.append("numIntervenant=").append(numIntervenant);
        sb.append(", dateCreatiion=").append(dateCreatiion);
        sb.append(", nbIntervenant=").append(nbIntervenant);
        return sb.toString();
    }
}
