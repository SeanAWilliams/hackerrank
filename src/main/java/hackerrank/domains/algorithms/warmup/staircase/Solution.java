package hackerrank.domains.algorithms.warmup.staircase;

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
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 1,j = count; i<=count; i++,j--){
            print(i,j);
            System.out.println();
        }
    }

    public static void print(int space, int stair){
        for(int i=1; i<(space+stair);i++){
            if( i >= stair){
                System.out.print("#");
            }
            else
                System.out.print(" ");
        }
    }
}