package tp02.ex02;

import java.time.LocalDate;

public class Fromateur extends Personne{
    int numIntervenant;
    LocalDate dateCreatiion;
    static int nbIntervenant;

    public Fromateur(String nom, String prenom, String telephone, int numIntervenant, LocalDate dateCreatiion) {
        super(nom, prenom, telephone);
        this.numIntervenant = numIntervenant;
        this.dateCreatiion = dateCreatiion;
        nbIntervenant ++;
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
