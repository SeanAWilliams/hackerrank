package hackerrank.domains.java.strings.stringcompare;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int size = sc.nextInt();
        String min = string.substring(0, size);
        String max = string.substring(0, size);
        for (int i = 0; i < string.length() - size + 1; i++) {
            int temp = max.compareTo(string.substring(i, i + size));
            if (temp < 0) {
                max = string.substring(i, i + size);
            }
            temp = min.compareTo(string.substring(i, i + size));
            if (temp > 0) {
                min = string.substring(i, i + size);
            }

        }
        System.out.println(min);
        System.out.println(max);


    }
}