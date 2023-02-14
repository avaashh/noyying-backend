package src.main.com.java.noyying;

import src.tests.java.GraphTest;

public class Main {

    public static void main(String[] args) {
        GraphTest tests = new GraphTest();
        System.out.println("\n\n\nTest 1:\n");
        tests.testShortestPath1();

        System.out.println("\n\n\nTest 2:\n");
        tests.testShortestPath2();

        System.out.println("\n\n\nTest 3:\n");
        tests.testShortestPath3();
    }
}
