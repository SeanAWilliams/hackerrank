package hackerrank.domains.algorithms.sorting.insertionsort1;

/**
 * Created by william on 11/4/2015.
 */

import java.util.Scanner;

public class Solution {


    public static void insertIntoSorted(int[] ar) {
        int sortInt = ar[ar.length - 1];
        //ignore the last item in array
        for (int i = ar.length - 2; i >= 0; i--) {
            if (sortInt > ar[i]) {
                ar[i + 1] = sortInt;
                printArray(ar);
                return;
            } else
                ar[i + 1] = ar[i];
            printArray(ar);
        }
        if (ar[0] > sortInt) {
            ar[0] = sortInt;
            printArray(ar);
        }

    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}