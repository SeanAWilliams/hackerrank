package hackerrank.domains.java.strings.stringtoken;

/**
 * Created by william on 10/23/2015.
 */

import java.util.ArrayList;
import java.util.Scanner;



public class Solution {


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String string1 = sc.nextLine();
        String[] yo =string1.split("[\\s&,_@<>&?$#*@!.']+");
        ArrayList<String> copy = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < yo.length;i++){
            if(yo[i].length()!=0){
                copy.add(yo[i]);
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i <copy.size();i++)
            System.out.println(copy.get(i));
    }
}
