package hackerrank.domains.algorithms.warmup.plusminus;

/**
 * Created by william on 10/23/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double pos=0,neg = 0,zero = 0;
        for (int i = 0; i < count; i++) {
            int temp = sc.nextInt();
            if( temp >0){
                pos++;
            }
            else if( temp <0){
                neg++;
            }
            else
                zero++;
        }

        System.out.println(pos/count);
        System.out.println(neg/count);
        System.out.println(zero/count);
    }
}