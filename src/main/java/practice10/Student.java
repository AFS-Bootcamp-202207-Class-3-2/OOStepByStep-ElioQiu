package practice10;

import constant.Common;

public class Student extends Person{
private int klassNum;
    private Klass klass;

    public Student(int id, String name, int age, int klassNum) {
        super(id, name, age);
        this.klassNum = klassNum;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public int getKlassNum() {
        return klassNum;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlassNum(int klassNum) {
        this.klassNum = klassNum;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        if (klass.getLeader() != null) {
            return Common.commonStudentLeader(super.introduce(), klass.getNumber());
        }
        return Common.commonStudentNoLeader(super.introduce(), klass.getNumber());
    }
}