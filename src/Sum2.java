//Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
public class Sum2 {

    public int sum(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }

        }

        return sum;
    }
}
