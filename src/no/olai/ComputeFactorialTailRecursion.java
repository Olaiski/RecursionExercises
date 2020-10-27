package no.olai;

public class ComputeFactorialTailRecursion {
    public static void main(String[] args) {

        System.out.println(factorial(4));

    }

    public static long factorial(int n) {
        return factorial(n, 1);
    }

    public static long factorial(int n, int result) {
        if (n == 0)
            return result;
        else
            return factorial(n - 1, n * result);
    }
}
