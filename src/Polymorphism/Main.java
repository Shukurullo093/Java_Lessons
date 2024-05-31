package Polymorphism;

public class Main {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
/**
 * If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
 * agar class ichida bir xil nomli turli data typeli yoki turlicha miqdordagi parametrga ega funksiyalar ishlatilsa bu Method overloading deyiladi.
 * Method overloading is used for compile-time polymorphism.
 */
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
/**
 * If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
 * Method overriding is used for runtime polymorphism.
 */
        A a = new A();
        a.f();

        B b = new B();
        b.f();
    }
}
