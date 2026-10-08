package u1;

import java.util.ArrayList;

public class Party {
    private ArrayList<Skill> hasSkills = new ArrayList<>();
    private ArrayList<ProjectTask> assignedTasks = new ArrayList<>();
    private Parteityp ptyp;

    public Party() {
        ptyp = new Parteityp();
    }
    public Party(Parteityp ptyp) {
        this.ptyp = ptyp;
    }

    public void addSkill(Skill s) {
        hasSkills.add(s);
    }
    public boolean hasSkill(Skill s) {
        return hasSkills.contains(s);
    }
    public void assignTask(ProjectTask pt) {
        boolean canDoTask = true;
        for (Skill s : pt.getRequiredSkills()) {
            canDoTask = canDoTask && this.hasSkill(s);
        }
        if (canDoTask) {
            assignedTasks.add(pt);
            System.out.println("Task assigned");
        } else {
            System.out.println("Task not assigned: missing skill(S)");
        }
    }
    public void addTask(ProjectTask pt) {
        if (ptyp.getCanDoTask().contains(pt.getAufgabentyp())) {

        }
    }
}
