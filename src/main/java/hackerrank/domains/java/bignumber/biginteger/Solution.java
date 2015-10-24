package hackerrank.domains.java.bignumber.biginteger;

/**
 * Created by william on 10/24/2015.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        BigInteger big1 = new BigInteger(string1);
        BigInteger big2 = new BigInteger(string2);
        System.out.println(big1.add(big2));
        System.out.println(big1.multiply(big2));
    }
}