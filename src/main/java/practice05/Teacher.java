package practice05;

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
        String introduce = "";
        if (klass != 0) {
            introduce = " I teach Class " + klass + ".";
        } else {
            introduce = " I teach No Class.";
        }
        return "My name is " + super.getName() + ". I am " + super.getAge() +
                " years old. I am a Teacher." + introduce;
    }
}
