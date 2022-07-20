package practice04;

import constant.Constant;

public class Person {
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format(Constant.PERSON_INTRODUCE, name, age);
    }
}
