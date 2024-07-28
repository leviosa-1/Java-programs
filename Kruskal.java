import java.util.*;

class Edge implements Comparable<Edge> {
    int u, v, weight;

    public Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(weight, other.weight);
    }
}

class UnionFind {
    int[] parent, rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py) {
            return;
        }
        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }
}

public class Kruskal {
    public static List<Edge> kruskal(int n, List<Edge> edges) {
        UnionFind uf = new UnionFind(n);
        List<Edge> mst = new ArrayList<>();
        Collections.sort(edges);
        for (Edge edge : edges) {
            if (uf.find(edge.u) != uf.find(edge.v)) {
                mst.add(edge);
                uf.union(edge.u, edge.v);
            }
        }
        return mst;
    }

    public static void main(String[] args) {
        int n = 4;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 1));
        edges.add(new Edge(0, 2, 3));
        edges.add(new Edge(1, 2, 4));
        edges.add(new Edge(1, 3, 2));
        edges.add(new Edge(2, 3, 5));
        List<Edge> mst = kruskal(n, edges);
        for (Edge edge : mst) {
            System.out.printf("(%d, %d, %d) ", edge.u, edge.v, edge.weight);
        }
        // Output: (0, 1, 1) (1, 3, 2) (0, 2, 3)
    }
}