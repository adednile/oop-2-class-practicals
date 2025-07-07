package RecursiveFunctions;

public class Factorial {
    public static int factorial(int n) {
        //base case
        if (n==0 || n==1) {
            return 1;
        } else {
            //recursive case n * factorial of (n-1)
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int result= factorial(5); //calculates the factorial of 5
        System.out.println("Factorial: " + result);
    }
}