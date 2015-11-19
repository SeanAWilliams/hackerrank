package hackerrank.domains.algorithms.search.sherlockandarray;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by william on 11/19/2015.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = in.nextInt();
            int[] intArray = new int[arraySize];
            int sum =0;
            HashMap<Integer, Integer> sums = new HashMap<>(arraySize);
            for (int j = 0; j < arraySize; j++) {
                intArray[j] = in.nextInt();
                sum += intArray[j];
                sums.put(j,sum);
            }

            if(search(intArray, sums))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean search(int[] intArray, HashMap<Integer, Integer> sums) {
        //if length is 1 sides are equal
        if(intArray.length ==1)
            return true;

        //check both sides of the array starting from the end. check the saved sum agasint the new sum.
        int rightSum = 0;
        for (int i = intArray.length-1; i >0; i--) {
            rightSum += intArray[i];
            if (sums.get(i) == rightSum)
                return true;
        }
        return false;
    }
}
