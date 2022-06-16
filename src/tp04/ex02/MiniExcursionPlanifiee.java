package tp04.ex02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MiniExcursionPlanifiee {
    private LocalDateTime heureDepart;
    private Integer nbInscrit;
    private MiniExcursion laMiniExcursion;

    public MiniExcursionPlanifiee(LocalDate heureDepart, Integer nbInscrit, MiniExcursion laMiniExcursion) {
        this.setHeureDepart(LocalDateTime.of(heureDepart, LocalTime.of(8, 0)));
        this.nbInscrit = nbInscrit;
        this.laMiniExcursion = laMiniExcursion;

    }public MiniExcursionPlanifiee(String heureDepart, Integer nbInscrit, MiniExcursion laMiniExcursion) {
        String[] tabHeureDepart = heureDepart.split("h");
        int heure = Integer.parseInt(tabHeureDepart[0]);
        int minute = Integer.parseInt(tabHeureDepart[1]);
        this.setHeureDepart(LocalDateTime.of(LocalDate.now(), LocalTime.of(heure, minute)));
        this.setNbInscrit(nbInscrit);
        this.setLaMiniExcursion(laMiniExcursion);
    }
    public boolean estComplete(){
        //retourne vrai si le nombre d'inscrit est égal au nombre de places prévues dans la mini excursion
        return getNbInscrit().equals(laMiniExcursion.getNbrePlace());
    }

    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }

    public Integer getNbInscrit() {
        return nbInscrit;
    }

    public MiniExcursion getLaminiExcursion() {
        return laMiniExcursion;
    }

    public void setHeureDepart(LocalDateTime  heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setNbInscrit(Integer nbInscrit) {
        this.nbInscrit = nbInscrit;
    }

    public void setLaMiniExcursion(MiniExcursion laMiniExcursion) {
        this.laMiniExcursion = laMiniExcursion;
    }


}
