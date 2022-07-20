package practice06;

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

    public int getKlassNum() {
        return klassNum;
    }

    public Klass getKlass() {
        return klass;
    }


    public String introduce() {
        return "My name is " + super.getName() + ". I am " + super.getAge() +
                " years old. I am a Student. I am at Class " + klass.getNumber() + ".";
    }
}
