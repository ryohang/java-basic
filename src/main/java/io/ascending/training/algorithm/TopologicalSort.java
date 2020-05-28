package io.ascending.training.algorithm;

import io.ascending.training.support.GraphList;

import java.util.*;

public class TopologicalSort {
    /**
     * Main method to be invoked to do topological sorting.
     */
    public Deque<Integer> topSort(GraphList graph) {
        Deque<Integer> stack = new ArrayDeque<>();
        boolean[] visited = new boolean[graph.getVertices()];
        for (int i = 0; i < visited.length; i++)
            visited[i] = false;
        for (int i = 0; i < visited.length; i++)
            if (visited[i] == false)
                topSortUtil(graph, i, stack,visited);
        return stack;
    }

    private void topSortUtil(GraphList graph,Integer vertex, Deque<Integer> stack,
                             boolean[] visited) {
        visited[vertex] = true;
        Integer i;
        Iterator<Integer> it = graph.getAdjList().get(vertex).iterator();
        while (it.hasNext())
        {
            i = it.next();
            if (!visited[i])
                topSortUtil(graph,i, stack,visited);
        }
        stack.push(vertex);
    }

    public static void main(String args[]){
        GraphList graph = new GraphList(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        TopologicalSort sort = new TopologicalSort();
        Deque<Integer> result = sort.topSort(graph);
        while(!result.isEmpty()){
            System.out.println(result.poll());
        }
    }
}
