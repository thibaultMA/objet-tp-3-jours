package tp04.ex02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class PlanningJournee {
    LocalDate laDate;
    List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees = new ArrayList<>();

    public PlanningJournee(LocalDate laDate, List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees) {
        setLaDate(laDate);
        setLesMiniExcursionsPlanifiees(lesMiniExcursionsPlanifiees);
    }

    public LocalDate getDate() {
        return laDate;
    }

    public List<MiniExcursionPlanifiee> getLesMiniExcursionsPlanifiees() {
        return lesMiniExcursionsPlanifiees;
    }

    public void setLaDate(LocalDate laDate) {
        this.laDate = laDate;
    }

    public void setLesMiniExcursionsPlanifiees(List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees) {
        lesMiniExcursionsPlanifiees.addAll(lesMiniExcursionsPlanifiees);
    }
}
