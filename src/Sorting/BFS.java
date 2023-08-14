package Sorting;

import java.util.ArrayList;

public class BFS {
    class Edge{
        int src;
        int des;
        Edge(int src,int des){
            this.src = src;
            this.des = des;
        }
    }
    void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
             graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,5));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,4));
    }

    //void BFS(ArrayList a)

    public static void main(String[] args) {
        BFS bfs = new BFS();
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        bfs.createGraph(graph);
    }

}
