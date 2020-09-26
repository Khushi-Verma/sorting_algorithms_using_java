public class Graph {
    private int n;
    private List<Integer>[] adjList;
    private List<Integer> topSort;
    private boolean used[];

    public Graph(int n) {
        this.n = n;
        adjList = new ArrayList[n + 1];
        topSort = new ArrayList<>();
        used = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList();
        }
    }

    public void addEdge(int a, int b) {
        adjList[a].add(b);
    }
}
