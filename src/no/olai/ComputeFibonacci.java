package no.olai;

public class ComputeFibonacci {

    private static int count;

    public static void main(String[] args) {

        int i = 4;

        System.out.println("The Fibonacci number at index " + i + " is " + fib(i));
        System.out.println("Called? " + count);


//        xMethod1(5);
//        System.out.println(" ");
//        xMethod2(5);
//        System.out.println(" ");
//        nPrintln("Hey", 5);

    }

    private static int fib(int i) {
        count++;
        if (i == 0)
            return 0;
        else if (i == 1 )
            return 1;
        else
            return fib(i -1 ) + fib(i - 2);
    }

//    private static void xMethod1(int n) {
//        if (n > 0) {
//            System.out.print(n + " ");
//            xMethod1(n - 1);
//        }
//    }
//
//    private static void xMethod2(int n) {
//        if (n > 0) {
//            xMethod2(n - 1);
//            System.out.print(n + " ");
//        }
//    }
//
//    private static void nPrintln(String message, int times) {
//        if (times >= 1) {
//            System.out.println(message);
//            nPrintln(message, times - 1);
//        }
//    }

}
