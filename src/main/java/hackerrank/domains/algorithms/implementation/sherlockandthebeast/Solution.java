package hackerrank.domains.algorithms.implementation.sherlockandthebeast;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {


    static String numbers(Scanner in) {
        int size = in.nextInt();
        int five = 1 * size, three = 0;
        five = 1 * size;
        int position = size;
        while (position >= 0) {
            if (five % 3 == 0 && three % 5 == 0)
                return buildString(five, three);
            position--;
            five--;
            three++;
        }
        if (five % 3 == 0 && three % 5 == 0)
            return buildString(five, three);

        return "-1";
    }


    static String buildString(int five, int three) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < five; i++)
            sb.append("5");
        for (int i = 0; i < three; i++)
            sb.append("3");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(numbers(in));
        }
    }
}