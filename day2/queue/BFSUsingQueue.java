package day2.queue;

public class BFSUsingQueue {

    public void bfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (int neighbor : graph[currentNode]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSUsingQueue bfs = new BFSUsingQueue();
        int[][] graph = {
            {1, 2},
            {0, 3, 4},
            {0, 5},
            {1},
            {1},
            {2}
        };
        System.out.println("BFS starting from node 0:");
        bfs.bfs(graph, 0);
    }
    
}
