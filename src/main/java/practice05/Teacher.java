package practice05;

import constant.Constant;

public class Teacher extends Person{
    private int klass = 0;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass != 0) {
            return String.join(" ",
                    super.introduce(),
                    String.format(Constant.TEACHER_TEACH_CLASS, klass));
        }
        return String.join(" ",
                super.introduce(),
                Constant.TEACHER_NO_TEACH_CLASS);
    }
}
