package hackerrank.domains.algorithms.implementation.finddigits;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i <= testCases; i++) {
            String number = scan.next();
            int mods = 0;
            for (int j = 0; j < number.length(); j++) {
                int temp = Character.getNumericValue(number.charAt(j));
                int parseTemp = Integer.parseInt(number);
                if (Character.getNumericValue(number.charAt(j)) != 0 && (Integer.parseInt(number) % Character.getNumericValue(number.charAt(j)) == 0))
                    mods++;
            }
            System.out.println(mods);
        }
    }
}