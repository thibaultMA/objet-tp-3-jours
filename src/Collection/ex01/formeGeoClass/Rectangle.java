package Collection.ex01.formeGeoClass;

import Collection.ex01.FormeGeoInterface;

public class Rectangle extends FormeGeoInterface<Integer> {
    Integer Hauteur;
    Integer Base;

    public Rectangle(Integer hauteur, Integer base) {
        Hauteur = hauteur;
        Base = base;
    }
    public Integer calculAir(){
        return (Hauteur*Base);
    }

    @Override
    public Integer calculPerim() {
        return (Hauteur + Base) *2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle [");
        sb.append("Hauteur=").append(Hauteur);
        sb.append(", Base=").append(Base);
        sb.append("] ");
        sb.append("Aire =").append(calculAir());
        sb.append("cm² Perimettre=").append(calculPerim()).append("cm");

        return sb.toString();
    }
}
