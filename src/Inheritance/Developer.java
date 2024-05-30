package Inheritance;

public class Developer extends Person{
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "position='" + position + '\'' +
                '}';
    }
}
