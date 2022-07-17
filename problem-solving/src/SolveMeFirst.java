import java.util.Scanner;

/**
 * Complete the function solveMeFirst to compute the sum of two integers.
 * <p>
 * Example
 * a = 7
 * b= 10
 * Return 17
 * Function Description
 * <p>
 * Complete the solveMeFirst function in the editor below.
 * <p>
 * solveMeFirst has the following parameters:
 * <p>
 * int a: the first value
 * int b: the second value
 * <p>
 * Returns
 * - int: the sum of
 * and
 * <p>
 * Constraints
 * <p>
 * Sample Input
 * <p>
 * a = 2
 * b = 3
 * <p>
 * Sample Output
 * <p>
 * 5
 * <p>
 * Explanation
 */
public class SolveMeFirst {
    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}


