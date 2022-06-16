package tp04.ex02;

import java.util.List;

public class MiniExcursionPayante extends MiniExcursion{
    private float tarif;
    public MiniExcursionPayante(String libelleMiniExcursion, int nbrePlace, List<Etape> lesEtapes, float tarif) {
        super(libelleMiniExcursion, nbrePlace, lesEtapes);
        setTarif(tarif);
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }
}
