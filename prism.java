import java.util.*;

public class prism {
    static class Edges{
        int src;
        int dest;
        int wt ;
        public Edges(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void creatGraph(ArrayList<Edges> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0, 1,10));
        graph[0].add(new Edges(0, 2, 15));
        graph[0].add(new Edges(0, 3, 30));

        graph[1].add(new Edges(1, 0,10));
        graph[1].add(new Edges(1, 3,40));

        graph[2].add(new Edges(2,0,15));
        graph[2].add(new Edges(2,3,50)); 

        graph[3].add(new Edges(3,1,40));
        graph[3].add(new Edges(3,2,50));
          
    }
    public static class Pair implements Comparable<Pair> {
        int node;
        int cost;
        public Pair(int n, int c) {
           this.cost=c;
           this.node=n;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;  // ascending 
        }
    }
    public static void primsAlgo(ArrayList<Edges> graph[],int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();  // (nod -int , cost - int)
        boolean vis[] = new boolean[V]; // mst
        pq.add(new Pair(0, 0));

        int finalcost = 0;
         while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                finalcost +=curr.cost;
                
                for(int i=0; i<graph[curr.node].size(); i++){
                    Edges e = graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
         }

         System.out.println("Minimum cost of mst =" +finalcost);
    }
    public static void main (String args[]){
        int v=4;
         ArrayList<Edges> graph[] = new ArrayList[v];
         creatGraph(graph);
         primsAlgo(graph, v);

    }
}
