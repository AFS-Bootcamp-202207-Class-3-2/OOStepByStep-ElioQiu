package practice10;

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

