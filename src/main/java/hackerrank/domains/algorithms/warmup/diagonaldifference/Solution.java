package hackerrank.domains.algorithms.warmup.diagonaldifference;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int x = 0, y = 0;
        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0, j = 0, k = arraySize - 1; i < arraySize; i++, j++, k--) {
            x += array[i][j];
            y += array[i][k];
        }
        System.out.println(Math.abs(x - y));
    }
}