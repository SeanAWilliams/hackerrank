package hackerrank.domains.algorithms.implementation.utopiantree;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {

    static int grow(Scanner in) {
        int cycles = in.nextInt();
        int size = 1;
        for (int i = 0; i < cycles; i++) {
            size *= 2;
            i++;
            if (i < cycles)
                size++;
            else
                return size;
        }
        return size;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(grow(in));
        }
    }
}