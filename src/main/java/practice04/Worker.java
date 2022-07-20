package practice04;

import constant.Constant;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        return String.join(" ",
                super.introduce(),
                Constant.WORKER_INTRODUCE);
    }
}
