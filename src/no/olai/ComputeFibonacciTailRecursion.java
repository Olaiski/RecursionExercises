package no.olai;

public class ComputeFibonacciTailRecursion {
    public static void main(String[] args) {
        int index = 4;
        System.out.println("The fib. number at index " + index + " is " + fib(index));
    }

    public static long fib(long index) {
        return fib(index, 1, 0);
    }


    public static long fib(long index, int next, int result) {
        if (index == 0)
            return result;
        else
            System.out.println("i: " + index + " n:" + next + " r:" + result);
            return fib(index - 1, next + result, next);
    }
}
