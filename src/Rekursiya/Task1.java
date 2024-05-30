package Rekursiya;

public class Task1 {
    static boolean isPolindrome(String str, int i) {
        if (i > str.length() / 2) return true;
        if(str.charAt(i) == str.charAt(str.length() - 1 - i)) return isPolindrome(str, ++i);
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPolindrome("123321", 0));
    }
}
