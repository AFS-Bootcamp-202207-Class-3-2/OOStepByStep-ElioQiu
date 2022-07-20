package practice10;

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
            System.out.printf("I am Tom. I know %s become Leader of Class 2.\n", student.getName());
            this.leader = student;
        }
    }

    public void appendMember(Student student) {
        System.out.printf("I am Tom. I know %s has joined Class 2.\n", student.getName());
        student.setKlass(this);
        this.studentList.add(student);
    }
}

