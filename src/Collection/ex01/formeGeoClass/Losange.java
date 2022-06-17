package Collection.ex01.formeGeoClass;

import Collection.ex01.FormeGeoInterface;

public class Losange extends FormeGeoInterface<Integer> {
    Integer grandeDiago;
    Integer petiteDiago;

    public Losange(Integer grandeDiago, Integer petiteDiago) {
        this.grandeDiago = grandeDiago;
        this.petiteDiago = petiteDiago;
    }

    @Override
    public Integer calculAir() {
        return (grandeDiago * petiteDiago)/2;
    }
    @Override
    public Integer calculPerim() {
        return (grandeDiago + petiteDiago) *2;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Losange [");
        sb.append("grandeDiago=").append(grandeDiago);
        sb.append(", petiteDiago=").append(petiteDiago);
        sb.append("] ");
        sb.append("Aire =").append(calculAir());
        sb.append("Perimettre =").append(calculPerim());
        return sb.toString();
    }
}
