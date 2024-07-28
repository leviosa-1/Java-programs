import java.util.*;
public class classroom {
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
        graph[0].add(new Edges(0, 1,2));
        graph[0].add(new Edges(0, 2, 4));

        graph[1].add(new Edges(1, 3,7));
        graph[1].add(new Edges(1, 2,1));

        graph[2].add(new Edges(2,4,3));

        graph[3].add(new Edges(3,5,1));

        graph[4].add(new Edges(4,3,2));
        graph[4].add(new Edges(4,5,5));
          
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int n, int d){
            this.node=n;
            this.dist=d;
        }
        @Override
        public int compareTo(Pair p2){   
            return this.dist -p2.dist; // to get queue based on distance (ascending order) 
        }
    }
    // Time complexity O(E + ElogV)
    public static void dijkstra(ArrayList<Edges> graph[],int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[]= new int[V];
        for(int i=0; i<V; i++){
            if(i!= src){
               dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];

        pq.add(new Pair(0, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove(); // sortest
            if(!vis[curr.node]){
                vis[curr.node]=true;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edges e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if(dist[u]+e.wt < dist[v]){   // relaxation
                        dist[v]= dist[u]+e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i=0; i<V; i++){
            System.out.println(dist[i]+" ");
        }
        System.out.println();

    }
    public static void main (String[] args){
        int v = 6;
        ArrayList<Edges> graph[]  = new ArrayList[v];
        creatGraph(graph);
        dijkstra(graph, 0, v);
    }
}

