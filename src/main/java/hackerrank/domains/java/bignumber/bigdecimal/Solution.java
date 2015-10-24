package hackerrank.domains.java.bignumber.bigdecimal;

/**
 * Created by william on 10/24/2015.
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

class Solution {

    public static void main(String[] argh) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<BigDecimal, List<String>> decimalStringTreeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String number = sc.next();
            BigDecimal decimal = new BigDecimal(number);
            if (decimalStringTreeMap.containsKey(decimal))
                decimalStringTreeMap.get(decimal).add(number);
            else {
                List<String> strings = new ArrayList<>();
                strings.add(number);
                decimalStringTreeMap.put(new BigDecimal(number), strings);
            }
        }

        while (!decimalStringTreeMap.isEmpty()) {
            BigDecimal highest = decimalStringTreeMap.lastKey();
            for (String string : decimalStringTreeMap.get(highest))
                System.out.println(string);
            decimalStringTreeMap.remove(highest);
        }
    }
}
