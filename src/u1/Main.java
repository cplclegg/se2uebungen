package u1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Skill qm = new Skill();
        Skill pm = new Skill();
        ProjectTask codereviewTests = new ProjectTask();
        codereviewTests.addRequiredSkill(qm);
        codereviewTests.addRequiredSkill(pm);
        Party hans =  new Party();
        hans.addSkill(pm);
        hans.assignTask(codereviewTests);
        hans.addSkill(qm);
        hans.assignTask(codereviewTests);
    }
}