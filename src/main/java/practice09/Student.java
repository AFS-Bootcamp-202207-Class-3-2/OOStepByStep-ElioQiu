package practice09;

import practice09.Klass;

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
        String introduce = "";
        if (klass.getLeader() != null) {
            introduce = " Leader of Class " + klass.getNumber() + ".";
        } else {
            introduce = " at Class " + klass.getNumber() + ".";
        }
        return "My name is " + super.getName() + ". I am " + super.getAge() +
                " years old. I am a Student. I am" + introduce;
    }
}
