package u1;

import java.util.ArrayList;

public class Parteityp {
    private ArrayList<Aufgabentyp> canDoTask = new ArrayList<>();
    private ArrayList<Aufgabentyp> canAssignTask = new ArrayList<>();

    public ArrayList<Aufgabentyp> getCanAssignTask() {
        return canAssignTask;
    }
    public ArrayList<Aufgabentyp> getCanDoTask() {
        return canDoTask;
    }
    public void addCanDoTask(Aufgabentyp atyp) {
        canDoTask.add(atyp);
    }
    public void addCanAssignTask(Aufgabentyp atyp) {
        canAssignTask.add(atyp);
    }
}
