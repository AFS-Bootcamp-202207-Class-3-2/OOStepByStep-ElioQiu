package practice07;

public class Klass {
    private int classNum;
    private Student leader;

    public Klass(int classNum) {
        this.classNum = classNum;
    }

    public int getI() {
        return classNum;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return classNum;
    }

    public String getDisplayName() {
        return "Class " + classNum;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
