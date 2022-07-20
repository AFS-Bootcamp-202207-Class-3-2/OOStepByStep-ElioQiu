package practice03;

import constant.Constant;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public String introduce() {
        return Constant.WORKER_INTRODUCE;
    }
}
