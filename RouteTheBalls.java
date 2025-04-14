import java.util.*;

public class RouteTheBalls {
    static class Graph {
        Map<String, List<String>> adjList;

        Graph() {
            adjList = new HashMap<>();
        }

        void addEdge(String from, String to) {
            adjList.putIfAbsent(from, new ArrayList<>());
            adjList.get(from).add(to);
        }

        List<String> getNeighbors(String node) {
            return adjList.getOrDefault(node, Collections.emptyList());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        Graph graph = new Graph();
        Map<String, String> colorToBucket = new HashMap<>();

        // Building the graph structure
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().trim().split(" ");
            String junction = line[0];
            for (int j = 1; j < line.length; j++) {
                graph.addEdge(junction, line[j]);
                if (!line[j].equals("source") && Character.isLowerCase(line[j].charAt(0))) {
                    colorToBucket.put(line[j], line[j]);
                }
            }
        }

        // Ball sequence
        String[] balls = sc.nextLine().trim().split(" ");

        // Keep track of open paths and count how many paths need to be opened
        Map<String, String> openPaths = new HashMap<>();
        int openCount = 0;

        for (String color : balls) {
            String targetBucket = colorToBucket.get(color);
            openCount += openPathsToBucket(graph, "source", targetBucket, openPaths);
        }

        System.out.println(openCount);
        sc.close();
    }

    static int openPathsToBucket(Graph graph, String start, String bucket, Map<String, String> openPaths) {
        // Perform BFS or DFS to find path to the bucket
        Queue<String> queue = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        queue.add(start);
        parent.put(start, null);

        while (!queue.isEmpty()) {
            String node = queue.poll();
            if (node.equals(bucket)) break;
            for (String neighbor : graph.getNeighbors(node)) {
                if (!parent.containsKey(neighbor)) {
                    parent.put(neighbor, node);
                    queue.add(neighbor);
                }
            }
        }

        // Count path openings and update open paths
        int pathOpens = 0;
        String curr = bucket;
        while (parent.get(curr) != null) {
            String from = parent.get(curr);
            if (!openPaths.getOrDefault(from, "").equals(curr)) {
                pathOpens++;
                openPaths.put(from, curr);
            }
            curr = from;
        }

        return pathOpens;
    }
}
