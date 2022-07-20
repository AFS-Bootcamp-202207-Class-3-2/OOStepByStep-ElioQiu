package practice09;

import practice09.Student;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int i;
    private Student leader;
    public List<Student> studentList = new ArrayList<>();

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
        if(!this.studentList.contains(student)){
            System.out.print("It is not one of us.\n");
            this.leader = null;
        }else {
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        this.studentList.add(student);
    }
}
