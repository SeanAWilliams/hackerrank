package hackerrank.domains.algorithms.warmup.timeconversion;

/**
 * Created by william on 10/23/2015.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String timeIn = sc.next();
        DateFormat sdf = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat output = new SimpleDateFormat("HH:mm:ss");
        Date date = sdf.parse(timeIn);
        System.out.println(output.format(date));
    }
}