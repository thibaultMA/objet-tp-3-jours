package tp04.ex01;

public class Terrasse extends Emplacement{

    protected Terrasse(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }
    public String affiche(){
        return this.toString();

    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Terrasse{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
