package Inheritance.Pack1;

import Inheritance.Pack2.B;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.name = "A class";
        System.out.println(a.name);

        B b = new B();
        b.name = "B class";
        System.out.println(b.name);
    }
}
