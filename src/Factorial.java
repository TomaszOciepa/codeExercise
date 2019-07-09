//Write a method that calculates the factorial of a given number.
//Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
//TIP: To make it more interesting, try to do it recursively.
public class Factorial {

    public int factorial(int n) {
        int factorial = n;

        for (int i = n -1; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
