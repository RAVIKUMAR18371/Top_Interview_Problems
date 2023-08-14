package College_allsem_revise;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BDFS {
    void createGraph(ArrayList<Edge> graph[], int V){
        for(int i = 0;i<V;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,5));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,4));

    }
   static class Edge{
        int src;
        int des;
        Edge(int src,int des){
            this.src = src;
            this.des = des;
        }
    }
    void bfs(ArrayList<Edge> graph[],int V){
        Queue<Integer> queue = new LinkedList<>();
        Boolean vis[] = new Boolean[V];
        for(int i = 0;i< vis.length;i++){
            vis[i] = false;
        }
        queue.add(0);
        while(!(queue.isEmpty())){
            int curr = queue.remove();
            if(vis[curr] == false){
            System.out.print(curr + "-->");
            vis[curr] = true;


                for(int i = 0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    queue.add(e.des);
                }
            }
        }
        System.out.println("BFS End");
    }

    void dfs(ArrayList<Edge> graph[],int V,int curr,boolean vis[]){
        if(vis[curr] == false) {
            System.out.print(curr + "-->");
            vis[curr] = true;
            for (int j = 0; j < graph[curr].size(); j++) {
                Edge e = graph[curr].get(j);
                dfs(graph, V, e.des, vis);
            }
        }
    }

    // Print all the path in the graph from source to target
    // let source->0th node and destination-->5th node
    // time complexity: O(V^V)--> it is not type of good time complexity.

  static void printAllPath(ArrayList<Edge> graph[],boolean vis[],int curr,String path,int tar){
        if(curr == tar){
            System.out.print(path+"-->");
            return;
        }

        for(int i=0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.des]){
                vis[curr] = true;
                printAllPath(graph, vis, e.des, path+e.des, tar);
                vis[curr] = false;
            }
        }
    }


    public static void main(String[] args) {
        BDFS fs = new BDFS();
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        fs.createGraph(graph , V);
        fs.bfs(graph , V);
        boolean vis[] = new boolean[V];
        for(int i= 0;i<V;i++){
            vis[i] = false;
        }
        fs.dfs(graph,V,0,vis);
        System.out.print("DFS End");


        //for print all path
        String path = "0";
        int src = 0;
        int tar = 5;
        printAllPath(graph, vis, src,path,tar);
    }
}
