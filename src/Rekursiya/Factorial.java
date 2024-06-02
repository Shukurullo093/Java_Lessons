package Rekursiya;

public class Factorial {
    static int Fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * Fact(--n);
    }

    static int Fact2(int n) {
        if (n == 2 || n == 1) return n;
        return n * Fact2(n - 2);
    }

    static int Fib1(int n) {
        if (n == 1 || n == 2) return 1;
        return Fib1(n - 1) + Fib1(n - 2);
    }

    public static void main(String[] args) {
//        System.out.println(Fact(5)); // N!
//        System.out.println(Fact2(6)); // N!!
        System.out.println(Fib1(9)); // 1, 1, 2, 3, 5, 8
        String str = new String();
    }
}
