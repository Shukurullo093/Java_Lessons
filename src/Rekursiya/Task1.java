package Rekursiya;

public class Task1 {
    static boolean isPalindrome1(String str, int i) {
        if (i > str.length() / 2) return true;
        if(str.charAt(i) == str.charAt(str.length() - 1 - i)) return isPalindrome1(str, ++i);
        else return false;
    }

    static boolean isPalindrome2(String str) {
        if (str.length() <= 1) return true;

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome2(str.substring(1, str.length() - 1));
        } else return false;
    }

    static int isPalindrome3(int n, int temp) {
        if (n == 0)
            return temp;

        temp = (temp * 10) + (n % 10);

        return isPalindrome3(n / 10, temp);
    }

    static boolean isPalindrome4(String str) {
        StringBuilder reStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reStr.append(str.charAt(i));
        }

        return reStr.toString().equals(str);
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome1("123321", 0));   // string recursion
//        System.out.println(isPalindrome2("123321"));      // string recursion
//        System.out.println(isPalindrome3(12345, 0));      // int recursion

//        System.out.println(isPalindrome4("12321"));       // string simple
    }
}