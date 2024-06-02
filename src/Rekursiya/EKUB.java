package Rekursiya;

public class EKUB {
    static int EKUB(int a, int b){
        if (a == b) return a;
        if (a > b) {
            a -= b;
        } else {
            b -= a;
        }
        return EKUB(a, b);
    }

    public static void main(String[] args) {
        System.out.println(EKUB(101, 18));
    }
}
