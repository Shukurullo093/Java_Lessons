package Encapsulation;

/** Encapsulation
 * encapsulation - kodni tashqi o'zgarishlardan himoya qilish &
 * yaxshiroq boshqarish uchun ish-di.
 * getter() - ma'lumotni o'qish u-n
 * setter() - ma'lumotni yozish u-n
 * class ichidagi o'zgaruvchilar private modifikatori bilan e'lon qilinadi
 * private orqali e'lon qilingan o'zgaruvchi faqat klass ichidagi constructor & method lar u-n
 * ------------------------------
 * encapsulation is a programming technique that binds the class members (variables and methods) together &
 * prevents them from being accessed by other classes,
 * thereby we can keep variables and methods safes from outside interference & misuse
 *
 * Encapsulation means combining the data of our application and its manipulation in one place. It allows the state of an object to be accessed and modified through behavior. It reduces the coupling of modules and increases the cohesion inside them.
 */

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
