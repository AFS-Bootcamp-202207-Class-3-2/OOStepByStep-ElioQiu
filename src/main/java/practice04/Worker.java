package practice04;

import constant.Constant;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        return String.join(" ",
                String.format(Constant.PERSON_INTRODUCE, super.getName(), super.getAge()),
                Constant.WORKER_INTRODUCE);
    }
}
