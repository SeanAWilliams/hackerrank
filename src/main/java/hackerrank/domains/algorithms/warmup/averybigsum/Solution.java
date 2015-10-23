package hackerrank.domains.algorithms.warmup.averybigsum;

/**
 * Created by william on 10/23/2015.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        BigInteger total = new BigInteger("0");
        for (int i = 0; i < arraySize; i++) {
            total = total.add(new BigInteger(sc.next()));
        }
        System.out.println(total.toString());
    }
}