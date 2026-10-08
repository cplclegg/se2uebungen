package u1;

import java.util.ArrayList;

public class ProjectTask {
    private ArrayList<Skill> requiresSkills = new ArrayList<>();
    private Aufgabentyp atyp;
    public ProjectTask() {
        atyp = new Aufgabentyp();
    }

    public ProjectTask(Aufgabentyp atyp) {
        this.atyp = atyp;
    }

    public void addRequiredSkill(Skill s) {
        requiresSkills.add(s);
    }
    public ArrayList<Skill> getRequiredSkills() {
        return requiresSkills;
    }
    public Aufgabentyp getAufgabentyp () {
        return atyp;
    }
}
