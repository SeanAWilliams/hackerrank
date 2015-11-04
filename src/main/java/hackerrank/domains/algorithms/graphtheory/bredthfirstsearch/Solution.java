package hackerrank.domains.algorithms.graphtheory.bredthfirstsearch;

/**
 * Created by william on 11/4/2015.
 */

import java.util.List;
import java.util.Scanner;

public class Solution {

    Graph graph = new Graph();


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int i = 0; i < tests; i++) {
            int nodes = in.nextInt();
            int edges = in.nextInt();
            for (int m = 0; m <= edges; m++) {

            }
        }
    }

}

class Graph{
    private int edges;
    private int nodes;

}

class Node {
    private int id;
    private List<Node> nodes;
}