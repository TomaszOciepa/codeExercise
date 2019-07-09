public class Main {

    public static void main(String[] args) {

//1. Write a method that sums two numbers.
        System.out.println("Exercise 1:");
        Sum sum = new Sum();
        System.out.println(sum.sum(2, 4));
//2. Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
        System.out.println("Exercise 2:");
        Sum2 sum2 = new Sum2();
        System.out.println(sum2.sum(4));

//3. //Write a method that calculates the factorial of a given number.
////Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
////TIP: To make it more interesting, try to do it recursively.
        System.out.println("Exercise 3:");
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(4));


//4. Write a method that calculates the factorial of a given number.
////Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
////TIP: To make it more interesting, try to do it recursively.
        System.out.println("Exercise 4:");
        int[] list = new int[]{3, 6, 5, 3, 2};
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.showList(list);
        System.out.println();
        System.out.println(linearSearch.linearSearch(3, list));

//5. Write a method that reverses a string.
//For example, 'java interview' becomes 'weivretni avaj'.
        System.out.println("Exercise 5:");
        ReverseString reverseString = new ReverseString();

        System.out.println(reverseString.reverse("Klaudia"));

    }
}
