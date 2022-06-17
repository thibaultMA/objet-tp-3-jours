package Collection.ex01.formeGeoClass;
import Collection.ex01.FormeGeoInterface;
public class Carre extends FormeGeoInterface<Integer> {

    Integer cote;

    public Carre(Integer cote) {
        this.cote = cote;
    }

    @Override
    public Integer calculAir() {
        return cote*2;
    }

    @Override
    public Integer calculPerim() {
        return cote*4;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carre [");
        sb.append("cote=").append(cote);
        sb.append("] ");
        sb.append("Aire =").append(calculAir());
        sb.append("Perimettre =").append(calculPerim());
        return sb.toString();
    }
}
