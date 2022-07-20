package practice05;

import constant.Constant;

public class Student extends Person{
    private final int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }


    public String introduce() {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, super.getName(), super.getAge()),
                String.format(Constant.STUDENT_INTRODUCE, klass));
    }
}
