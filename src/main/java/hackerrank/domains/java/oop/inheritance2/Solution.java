package hackerrank.domains.java.oop.inheritance2;

/**
 * Created by william on 10/24/2015.
 */
class Arithmetic {


}

class Adder extends Arithmetic {
    public int add(int i, int j){
        return i+j;
    }
}

class Solution{

    public static void main(String []argh){
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");

    }
}