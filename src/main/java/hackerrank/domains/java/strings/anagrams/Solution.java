package hackerrank.domains.java.strings.anagrams;

/**
 * Created by william on 10/24/2015.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next().toLowerCase();
        String string2 = sc.next().toLowerCase();
        char[] chars1 = string1.toCharArray();
        Arrays.sort(chars1);
        char[] chars2 = string2.toCharArray();
        Arrays.sort(chars2);
        String sorted1 = new String(chars1);
        String sorted2 = new String(chars2);
        if (sorted1.equals(sorted2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

    }
}
