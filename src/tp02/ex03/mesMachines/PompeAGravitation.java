package tp02.ex03.mesMachines;

import java.time.LocalDate;

public class PompeAGravitation extends Machine{
    int capaciteHL;
    boolean eauOperationelle;

    public PompeAGravitation(LocalDate dateAchat, String marque, String modele, int capaciteHL,boolean eauOperationelle) {
        super(dateAchat, marque, modele);
        this.capaciteHL = capaciteHL;
        this.eauOperationelle = eauOperationelle;
    }
    @Override
    public String toString() {
        return "(" + capaciteHL + "W) "+"("+eauOperationelle+"operationel)"+ super.toString();
    }
}
