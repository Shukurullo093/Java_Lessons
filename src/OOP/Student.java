package OOP;

public class Student {
    String name;
    int age;
    String gender;

    Student(){
        System.out.println("no-args constructor");
    }

    Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


}
