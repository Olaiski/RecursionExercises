package no.olai;

public class RecursivePalindromeSubstring {
    public static void main(String[] args) {

        System.out.println(isPalindrome("malayalam"));
//        System.out.println(isPalindrome("dad"));
//        System.out.println(isPalindrome("moon"));


//        nPrintln("Yo", 5);

    }


    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    public static boolean isPalindrome(String s, int low, int high) {
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else
            System.out.println(s.substring(low + 1, high ));
            return isPalindrome(s, low + 1, high - 1);
    }


//    public static boolean isPalindrome(String s) {
//        if (s.length() <= 1)
//            return true;
//        else if (s.charAt(0) != s.charAt(s.length() - 1))
//            return false;
//        else
//            System.out.println(s.substring(1, s.length() - 1));
//            return isPalindrome(s.substring(1, s.length() - 1));
//    }

    public static void nPrintln(String message, int times) {
        if (times >= 1) {
            System.out.println(message);
            nPrintln(message, times - 1);
        }
    }
}
