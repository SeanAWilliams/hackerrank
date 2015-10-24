package hackerrank.domains.algorithms.dynamicprogramming.fibonaccimodified;

/**
 * Created by william on 10/24/2015.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable names correspond to names given in problem statement.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        List<BigInteger> series = new ArrayList<>();
        series.add(new BigInteger(String.valueOf(a)));
        series.add(new BigInteger(String.valueOf(b)));
        for (int i = 0, j = b; j <= n - 1; i++, j++) {
            BigInteger itemT = series.get(i + 1).pow(2).add(series.get(i));
            series.add(itemT);
        }
        System.out.println(series.get(n - 1));
    }
}