package tp03.ex02;

import java.time.LocalDate;
import java.util.HashMap;

public class Mission {
    String nom;
    String description;
    Integer nbHeurePrevu;
    Intervenant intervenant;
    HashMap<LocalDate,Integer> releveHoraire = new HashMap<>();

    public Intervenant getIntervenant() {
        return intervenant;
    }

    public Mission(String nom, String description, int nbHeurePrevu, Intervenant intervenant) {
        this.nom = nom;
        this.description = description;
        this.nbHeurePrevu = nbHeurePrevu;
        this.intervenant = intervenant;
    }

    public void ajoutReleve(LocalDate laDate, Integer nbHeurePrevu){
        releveHoraire.put(laDate , nbHeurePrevu);
    }
    public Intervenant getExecutant(){
        return intervenant;
    }
    public HashMap<LocalDate,Integer> getReleveHoraire(){
        return releveHoraire;
    }
    public double nbHeuresEffectues() {
        double heureEffectuer = 0;
        for (Integer value : releveHoraire.values()) {
            heureEffectuer += value;
        }
        return heureEffectuer;
    }
}
