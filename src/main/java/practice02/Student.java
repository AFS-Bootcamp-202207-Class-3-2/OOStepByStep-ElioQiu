package practice02;

import constant.Constant;

public class Student extends Person{
    public int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format(Constant.STUDENT_INTRODUCE, klass);
    }
}
