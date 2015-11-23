import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        //testPQ();
        testGraph();
    }
    public static void testPQ(){
        PriorityQueue<String> h = new PriorityQueue<>(10);
        h.enqueue("J");
        h.enqueue("A");
        h.enqueue("M");
        h.enqueue("B");
        h.enqueue("L");
        h.enqueue("E");

        System.out.println(h);

        System.out.println(h.dequeue() + "\n");

        System.out.println(h);
    }
    public static void testGraph(){
        WeightedGraph<String> graph = new WeightedGraph<String>();
        String s0 = new String("Atlanta   ");
        String s1 = new String("Austin    ");
        String s2 = new String("Chicago   ");
        String s3 = new String("Dallas    ");
        String s4 = new String("Denver    ");
        String s5 = new String("Houston   ");
        String s6 = new String("Washington");

        graph.addVertex(s0);
        graph.addVertex(s1);
        graph.addVertex(s2);
        graph.addVertex(s3);
        graph.addVertex(s4);
        graph.addVertex(s5);
        graph.addVertex(s6);

        graph.addEdge(s0, s5, 800);
        graph.addEdge(s0, s6, 600);
        graph.addEdge(s1, s3, 200);
        graph.addEdge(s1, s5, 160);
        graph.addEdge(s2, s4, 1000);
        graph.addEdge(s3, s1, 200);
        graph.addEdge(s3, s2, 900);
        graph.addEdge(s3, s4, 780);
        graph.addEdge(s4, s0, 1400);
        graph.addEdge(s4, s2, 1000);
        graph.addEdge(s5, s0, 800);
        graph.addEdge(s6, s0, 600);
        graph.addEdge(s6, s3, 1300);

        boolean result;

        System.out.println("depth first ...");
        result = WeightedGraph.isPath(graph, s1, s2);
        System.out.println("s1 s2 " + result);
        result = WeightedGraph.isPath(graph, s1, s6);
        System.out.println("s1 s6 " + result);
        result = WeightedGraph.isPath(graph, s6, s5);
        System.out.println("s6 s5 " + result);
        result = WeightedGraph.isPath(graph, s6, s3);
        System.out.println("s6 s3 " + result);
        result = WeightedGraph.isPath(graph, s6, s1);
        System.out.println("s6 s1 " + result);

        System.out.println();
        System.out.println("breadth first ...");
        result = WeightedGraph.isPath(graph, s1, s2);
        System.out.println("s1 s2 " + result);
        result = WeightedGraph.isPath(graph, s1, s6);
        System.out.println("s1 s6 " + result);
        result = WeightedGraph.isPath(graph, s6, s5);
        System.out.println("s6 s5 " + result);
        result = WeightedGraph.isPath(graph, s6, s3);
        System.out.println("s6 s3 " + result);
        result = WeightedGraph.isPath(graph, s6, s1);
        System.out.println("s6 s1 " + result);
        System.out.println();
        WeightedGraph.shortestPaths(graph, s6);

        System.out.println();
        System.out.println();
        WeightedGraph.shortestPaths(graph, s4);

    }
}
