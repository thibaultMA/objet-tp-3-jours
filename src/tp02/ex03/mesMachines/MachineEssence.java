package tp02.ex03.mesMachines;

import java.time.LocalDate;
public class MachineEssence extends Machine {
    private int puissanceCV;

    public MachineEssence(LocalDate dateAchat, String marque, String
            modele, int puissanceCV) {
        super(dateAchat, marque, modele);
        this.puissanceCV = puissanceCV;
    }

    /**
     * {@inheritDoc}
     * @see mesMachines.Machine#toString()
     */
    @Override
    public String toString() {
        return "(" + puissanceCV + "W) " + super.toString();
    }
}
