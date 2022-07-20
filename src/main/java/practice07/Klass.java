package practice07;

public class Klass {
    private int i;
    private Student leader;

    public Klass(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return i;
    }

    public String getDisplayName() {
        return "Class " + i;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
