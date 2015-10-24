package hackerrank.domains.java.strings.stringreverse;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed = reversed + string.charAt(i);
        }
        if (string.equals(reversed))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
