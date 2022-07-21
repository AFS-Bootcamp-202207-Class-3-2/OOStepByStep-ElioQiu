package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int classNum;
    private Student leader;
    public List<Student> studentList = new ArrayList<>();

    public Klass(int classNum) {
        this.classNum = classNum;
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
        if(!this.studentList.contains(student)){
            System.out.print("It is not one of us.\n");
        }else {
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        this.studentList.add(student);
    }
}
