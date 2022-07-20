package practice08;

import practice08.Klass;
import practice08.Student;

public class Teacher extends Person{
    private int klassNum = 0;
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, int klassNum) {
        super(id, name, age);
        this.klassNum = klassNum;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getKlassNum() {
        return klassNum;
    }

    public String introduce() {
        String introduce = "";
        if (klass != null) {
            introduce = " I teach Class " + klass.getNumber() + ".";
        } else {
            introduce = " I teach No Class.";
        }
        return "My name is " + super.getName() + ". I am " + super.getAge() +
                " years old. I am a Teacher." + introduce;
    }

    public String introduceWith(Student student) {
        String introduce = "";
        if (klass.getNumber() != student.getKlass().getNumber()) {
            introduce = " I don't teach " + student.getName() + ".";
        } else {
            introduce = " I teach " + student.getName() + ".";
        }
        return "My name is " + super.getName() + ". I am " + super.getAge() +
                " years old. I am a Teacher." + introduce;
    }
}
