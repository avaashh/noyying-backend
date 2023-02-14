package src.tests.java;

import java.util.List;

import src.main.com.java.noyying.Graph;

public class GraphTest {

    public void testShortestPath1() {
        Graph graph = this.constructGraph();
        List<String> result = graph.shortestPath("A", "F");
        System.out.println("shortest path between A and F: " + result);
        this.assertEquals(result.size(), 5);
        this.assertEquals(result.get(0), "A");
        this.assertEquals(result.get(1), "C");
        this.assertEquals(result.get(2), "B");
        this.assertEquals(result.get(3), "D");
        this.assertEquals(result.get(4), "F");
    }

    public void testShortestPath2() {
        Graph graph = this.constructGraph();
        List<String> result = graph.shortestPath("D", "A");
        System.out.println("shortest path between D and A: " + result);
        this.assertEquals(result.size(), 4);
        this.assertEquals(result.get(0), "D");
        this.assertEquals(result.get(1), "B");
        this.assertEquals(result.get(2), "C");
        this.assertEquals(result.get(3), "A");
    }

    public void testShortestPath3() {
        Graph graph = this.constructGraph();
        List<String> result = graph.shortestPath("C", "F");
        System.out.println("shortest path between C and F: " + result);
        this.assertEquals(result.size(), 4);
        this.assertEquals(result.get(0), "C");
        this.assertEquals(result.get(1), "B");
        this.assertEquals(result.get(2), "D");
        this.assertEquals(result.get(3), "F");
    }

    private void assertEquals(Object a, Object b) {
        if ((a instanceof Integer && a != b) || (a instanceof String && !a.equals(b))) {
            System.out.println("Assertion failed: " + a + " , " + b);
        }
    }

    private Graph constructGraph() {
        Graph graph = new Graph();
        graph.addEdge("A", "B", 5);
        graph.addEdge("A", "C", 1);
        graph.addEdge("B", "C", 2);
        graph.addEdge("B", "D", 1);
        graph.addEdge("C", "D", 4);
        graph.addEdge("C", "E", 8);
        graph.addEdge("D", "E", 3);
        graph.addEdge("D", "F", 6);
        return graph;
    }
}
