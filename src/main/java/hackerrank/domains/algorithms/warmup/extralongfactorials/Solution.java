package hackerrank.domains.algorithms.warmup.extralongfactorials;

/**
 * Created by william on 10/23/2015.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        //Input
        Scanner sc = new Scanner(System.in);
        String factorial = sc.next();
        BigInteger result = new BigInteger(factorial);
        result = factorial(result);
        System.out.println(result);
    }

    private static BigInteger factorial(BigInteger fact) {
        if (fact.intValue() <= 1) {
            return fact;
        } else {
            fact = factorial(fact.add(new BigInteger("-1"))).multiply(fact);
            return fact;
        }
    }
}