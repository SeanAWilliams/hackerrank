package hackerrank.domains.algorithms.implementation.angryprofessor;

/**
 * Created by william on 10/23/2015.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            int students = scan.nextInt();
            int lateCount = scan.nextInt();
            int early = 0;
            for (int j = 0; j < students; j++) {
                int temp = scan.nextInt();
                if (temp <= 0)
                    early++;
            }
            if (early >= lateCount)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}