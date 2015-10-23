package hackerrank.domains.algorithms.warmup.libraryfine;

/**
 * Created by william on 10/23/2015.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        SimpleDateFormat sdf = new SimpleDateFormat("d M yyyy");
        Scanner scan = new Scanner(System.in);
        String actualDate = scan.nextLine();
        String overDueDate = scan.nextLine();
        Date actual = sdf.parse(actualDate);
        Date overDue = sdf.parse(overDueDate);
        System.out.println(due(actual, overDue));
    }

    public static int due(Date ad, Date od) {
        Calendar actual = Calendar.getInstance();
        actual.setTime(ad);
        Calendar overDue = Calendar.getInstance();
        overDue.setTime(od);
        return check(actual, overDue);
    }

    public static int check(Calendar a, Calendar d) {
        int temp = (a.get(a.DAY_OF_MONTH) - d.get(d.DAY_OF_MONTH));
        if (a.compareTo(d) <= 0)
            return 0;
        else if (a.get(a.MONTH) == d.get(d.MONTH) && a.get(a.YEAR) == d.get(d.YEAR)) {
            return 15 * (a.get(a.DAY_OF_MONTH) - d.get(d.DAY_OF_MONTH));
        } else if (a.get(a.YEAR) == d.get(d.YEAR)) {
            return 500 * (a.get(a.MONTH) - d.get(d.MONTH));
        } else
            return 10000;
    }
}