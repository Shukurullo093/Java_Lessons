package Collections1;

public class Obj {
    protected String name;
    protected int age;

    public Obj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
