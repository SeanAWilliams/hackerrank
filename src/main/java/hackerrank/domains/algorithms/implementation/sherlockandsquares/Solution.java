package hackerrank.domains.algorithms.implementation.sherlockandsquares;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {

    static int squares(Scanner in) {
        Long start = in.nextLong();
        Long end = in.nextLong();
        Double floor = Math.floor(Math.sqrt(end));
        Double ceil = Math.ceil(Math.sqrt(start));
        int answer = (int) Math.floor(floor - ceil) + 1;
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(squares(in));
        }
    }
}