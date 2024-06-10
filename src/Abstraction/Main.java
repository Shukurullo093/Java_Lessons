package Abstraction;

public class Main {
    public static void main(String[] args) {
        Operational addition = (int a, int b) -> (a + b) / 2;
        Operational subtraction = (int a, int b) -> a - b;
        Operational multiply = (int a, int b) -> a * b;
        Operational divide = (int a, int b) -> a / b;

        System.out.println(addition.calculate(10, 2));
        System.out.println(subtraction.calculate(10, 2));
        System.out.println(multiply.calculate(10, 2));
        System.out.println(divide.calculate(10, 2));
    }
}
