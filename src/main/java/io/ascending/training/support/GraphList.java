package io.ascending.training.support;

import java.util.ArrayList;
import java.util.List;

//https://media.geeksforgeeks.org/wp-content/cdn-uploads/graph.png
public class GraphList {
    private int vertices;
    private List<List<Integer>> adjList;
    //v for vertice
    public GraphList(int v){
        this.vertices = v;
        adjList = new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<Integer>());
        }
    }
    public void addEdge(Integer v1,Integer v2){
        adjList.get(v1).add(v2);
    }

    public List<List<Integer>> getAdjList(){
        return adjList;
    }

    public String toString(){
        String result="";
        for(int i=0;i<adjList.size();i++){
            result+=i+"->"+adjList.get(i).toString()+";\n";
        }
        return result;
    }

    public int getVertices() {
        return vertices;
    }

    public static void main(String[] args){
        GraphList g = new GraphList(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("graph adjacency list representation\n"+g);
    }
}
