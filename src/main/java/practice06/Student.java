package practice06;

import constant.Constant;

public class Student extends Person{
    private int klassNum;
    private Klass klass;

    public Student(String name, int age, int klassNum) {
        super(name, age);
        this.klassNum = klassNum;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return String.join(" ",
                super.introduce(),
                String.format(Constant.STUDENT_INTRODUCE, klass.getNumber()));
    }
}
