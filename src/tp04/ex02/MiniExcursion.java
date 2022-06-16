package tp04.ex02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MiniExcursion {
    private final Integer numMiniExcursion;
    private static Integer nbrMiniExcursion = 0;
    private String libelleMiniExcursion;
    private int nbrePlace;
    private List<Etape> lesEtapes = new ArrayList<>();
//    public MiniExcursion(String libelleMiniExcursion, int nbrePlace, List lesEtapes) {
//
//        // construit l'objet avec les valeurs passées en paramètres
//// le numéro de l'excursion est directement construit grâce au nombre d'excursion
//    }

    public MiniExcursion(String libelleMiniExcursion, int nbrePlace, List<Etape> lesEtapes) {

        setLibelleMiniExcursion(libelleMiniExcursion);
        this.nbrePlace = nbrePlace;
        setNbrePlace(nbrePlace);
        setLesEtapes(lesEtapes);
        ++nbrMiniExcursion;
        this.numMiniExcursion = nbrMiniExcursion;
    }

    private void setLesEtapes(List<Etape> lesEtapes) {
        this.lesEtapes.addAll(lesEtapes);
    }

    public Integer getNumMiniExcursion() {
        return numMiniExcursion;
    }

    public String getLibelleMiniExcursion() {
        return libelleMiniExcursion;
    }

    public int getNbrePlace() {
        return nbrePlace;
    }

    public void setLibelleMiniExcursion(String libelleMiniExcursion) {
        this.libelleMiniExcursion = libelleMiniExcursion;
    }

    public void setNbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }
    public void ajouteEtape(Etape uneEtape){
        this.lesEtapes.add(uneEtape);
    }
    public int donneDureePrevue(){
        // retourne la durée prévue formatée en minutes
        int dure=0;
        for (Etape lesEtape : lesEtapes) {
            dure += lesEtape.getDureePrevue();
        }
        return dure;
    }
    public LocalTime donneDureePrevueHHMM(){
        return  LocalTime.ofSecondOfDay(donneDureePrevue() * 60L);
    }
}
