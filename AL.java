import java.util.*;;
public class AL {
    static class Edges{
        int src;
        int dest;
        public Edges(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void creatGraph(ArrayList<Edges> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0, 1));

        graph[1].add(new Edges(1, 2));
        graph[1].add(new Edges(1, 3));

        graph[2].add(new Edges(2,0));
        graph[2].add(new Edges(2,1));
        graph[2].add(new Edges(2, 3));

        graph[3].add(new Edges(3,1));
        graph[3].add(new Edges(3, 2));
          
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edges> graph[]  = new ArrayList[v];
        creatGraph(graph);
        // print 2's neighbour 
        for(int i=0; i<graph[2].size();i++){
            Edges e = graph[2].get(i);
            System.out.println(e.dest+" ");
        }
    }
}

