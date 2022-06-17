package Collection.ex01.formeGeoClass;


public class Triangle extends Rectangle {
    public Triangle(Integer hauteur, Integer base) {
        super(hauteur, base);
    }

    @Override
    public Integer calculAir() {
        return super.calculAir()/2;
    }

    @Override
    public Integer calculPerim() {
        int autreCote = (int)(Math.sqrt(Math.pow((int) (this.Base/2),2)+Math.pow(this.Hauteur,2)));
        return this.Base+(autreCote*2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
