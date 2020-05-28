package io.ascending.training.support;

public class GraphMatrix {
    private int vertices;
    private int[][] matrix;
    public GraphMatrix(int v){
        this.vertices = v;
        this.matrix = new int[v][v];
    }

    public void addEdge(Integer v1,Integer v2){
        matrix[v1][v2]=1;
    }

    public int getVertices() {
        return vertices;
    }

    public int[][] getMatrix() {
        return matrix;
    }
    public String toString(){
        String result="";
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                result+=matrix[i][j];
            }
            result+="\n";
        }
        return result;
    }

    public static void main(String[] args){
        GraphMatrix g = new GraphMatrix(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("graph matrix representation\n"+g);
    }
}
