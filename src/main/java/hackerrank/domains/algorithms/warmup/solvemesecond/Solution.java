package hackerrank.domains.algorithms.warmup.solvemesecond;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

class Solution {

    static int solveMeSecond(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        int sum;
        int a, b;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            sum = solveMeSecond(a, b);
            System.out.println(sum);
        }
    }
}
