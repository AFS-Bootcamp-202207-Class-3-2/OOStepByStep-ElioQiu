package practice10;

import constant.Common;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private int klassNum = 0;
    private Klass klass;
    private LinkedList<Klass> classes;


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

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getKlassNum() {
        return klassNum;
    }

    public String introduce() {
        if (klass != null) {
            return Common.commonTeacherTeachClass(super.introduce(), klass.getNumber());
        } else if (classes != null) {
            String classList = classes.stream()
                    .map(klass -> String.valueOf(klass.getNumber()))
                    .collect(Collectors.joining(", ")) + ".";
            return Common.commonTeacherTeachClassList(super.introduce(), classList);
        }
        return Common.commonTeacherNoTeachClass(super.introduce());
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return Common.commonTeacherTeachPerson(super.introduce(), student.getName());
        }
        return Common.commonTeacherNoTeachPerson(super.introduce(), student.getName());
    }

    public boolean isTeaching(Student student) {
        return classes.stream()
                .map(klass -> klass.getNumber() == (student.getKlass().getNumber()))
                .findAny()
                .orElse(false);
    }
}

