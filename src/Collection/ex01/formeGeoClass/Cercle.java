package Collection.ex01.formeGeoClass;

import Collection.ex01.FormeGeoInterface;

public class Cercle extends FormeGeoInterface<Double> {
    Integer rayon;

    public Cercle(Integer rayon) {
        this.rayon = rayon;
    }

    @Override
    public Double calculAir() {
        return (rayon*rayon)*Math.PI;
    }

    @Override
    public Double calculPerim() {
        return Math.PI*2*rayon;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cercle [");
        sb.append("rayon=").append(rayon);
        sb.append("] ");
        sb.append("Aire =").append(calculAir());
        sb.append("Perimettre =").append(calculPerim());
        return sb.toString();
    }
}
