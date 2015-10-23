package hackerrank.domains.algorithms.warmup.simplearraysum;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int total = 0;
        for (int i = 0; i < arraySize; i++) {
            total += sc.nextInt();
        }
        System.out.println(total);
    }
}