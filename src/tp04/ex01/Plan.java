package tp04.ex01;

import java.util.ArrayList;
import java.util.List;

public class Plan {
    private String echelle;
    private String NomFichier;

    private List<Emplacement> emplacementList = new ArrayList<>();
    public Plan(String NomFichier) {
        this.setNomFichier(NomFichier);
    }

    public void setNomFichier(String NomFichier) {
        this.NomFichier = NomFichier;
    }

    public String getEchelle() {
        return echelle;
    }

    public void setEchelle(String echelle) {
        this.echelle = echelle;
    }

    public List<Emplacement> getEmplacementList() {
        return emplacementList;
    }

    public void setEmplacementList(List<Emplacement> emplacementList) {
        this.emplacementList = emplacementList;
    }

    public String getNomFichier() {
        return this.NomFichier;
    }

    public void ajouteEmplacement(Emplacement emplacement) {
        emplacementList.add(emplacement);
    }

    public void supprimeEmplacement(Emplacement emplacement) {
        emplacementList.remove(emplacement);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plan{");
        sb.append("echelle='").append(this.getEchelle()).append('\'');
        sb.append(", NomFichier='").append(getNomFichier()).append('\'');
        sb.append(", emplacementList=").append(emplacementList);
        sb.append('}');
        return sb.toString();
    }

    public String affiche(){
        return toString();
    }
}
