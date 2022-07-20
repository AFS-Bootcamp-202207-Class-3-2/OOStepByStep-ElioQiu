package practice06;

import constant.Common;

public class Teacher extends Person{
    private int klassNum = 0;
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klassNum) {
        super(name, age);
        this.klassNum = klassNum;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (this.klass != null) {
            return Common.commonTeacherTeachClass(super.getName(), super.getAge(), klass.getNumber());
        }
        return Common.commonTeacherNoTeachClass(super.getName(), super.getAge());
    }

    public String introduceWith(Student student) {
        if (klass.getNumber() == student.getKlass().getNumber()) {
            return Common.commonTeacherTeachPerson(super.getName(), super.getAge(), student.getName());
        }
        return Common.commonTeacherNoTeachPerson(super.getName(), super.getAge(), student.getName());
    }
}
