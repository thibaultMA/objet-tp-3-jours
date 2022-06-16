package tp04.ex02;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Etape {
    private static Integer nrbEtape = 0;
    private final Integer numEtape;
    private String descriptionPrevue;
    private Integer dureePrevue;


    /**
     * @param descriptionPrevue
     * @param dureePrevue{int} duréé prevu de l'etape heure:minute:seconde
     */
    public Etape(String descriptionPrevue, int dureePrevue) {
        ++nrbEtape;
        setDescriptionPrevue(descriptionPrevue);
        setDureePrevue(dureePrevue);
        numEtape = getNrbEtape();
    }

    public Integer getNumEtape() {
        return numEtape;
    }

    public static Integer getNrbEtape() {
        return nrbEtape;
    }

    public String getDescriptionPrevue() {
        return descriptionPrevue;
    }

    public void setDescriptionPrevue(String descriptionPrevue) {
        this.descriptionPrevue = descriptionPrevue;
    }

    public int getDureePrevue() {
        return  dureePrevue;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }
    public LocalTime donneDureePrevueHHMM() {
        //retourne la durée prévue sous la forme HH:MM:SS exemple 02:05:23


        return  LocalTime.ofSecondOfDay(dureePrevue * 60L);
    }
}
