package Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(23);
        System.out.println(person);

        Developer developer = new Developer();
        developer.setPosition("Backend");
        System.out.println(developer);
    }
}
