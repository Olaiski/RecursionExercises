package no.olai;

public class ComputeFactorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));


        System.out.println(recursiveAdd(1, 6));

    }
    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int recursiveAdd(int n, int max) {
        if (n >= max) {
            return max;
        }

        System.out.println(n + 1);
        return n + recursiveAdd(n + 1, max);
    }

}
