package tp03.ex02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Projet {
    String nom;
    LocalDate dateDebut;
    LocalDate dateFin;
    double prixFactureMO;
    List<Mission>  lesMissions = new ArrayList<>();

    public Projet(String nom, LocalDate dateDebut, LocalDate dateFin, double prixFactureMO, List<Mission> lesMissions) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixFactureMO = prixFactureMO;
        this.lesMissions = lesMissions;
    }
    public double cumulCoutMO(){
        double cout = 0;
        for (Mission lesMission : lesMissions) {
            cout += lesMission.getIntervenant().getTauxHauraire() * lesMission.nbHeuresEffectues();
        }
        return cout;
    }
    public Double margeBruteCourante(){

        return prixFactureMO - cumulCoutMO();
    }
}
