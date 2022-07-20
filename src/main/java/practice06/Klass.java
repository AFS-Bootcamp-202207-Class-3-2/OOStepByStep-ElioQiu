package practice06;

public class Klass {
    private int i;
    public Klass(int i) {
        this.i = i;
    }

    public int getNumber() {
        return i;
    }

    public String getDisplayName() {
        return "Class " + i;
    }
}
