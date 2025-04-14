import java.util.*;

public class CommonCubeFaces {
    static int Q;  // Number of queries
    static Map<Integer, Map<String, Integer>> cubePositions;
    static Set<String> commonSides;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        cubePositions = new HashMap<>();
        commonSides = new HashSet<>();


        for (int i = 0; i < Q; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            int cubeA = Integer.parseInt(parts[0]);
            int cubeB = Integer.parseInt(parts[1]);
            String direction = parts[2];


            cubePositions.putIfAbsent(cubeA, new HashMap<>());
            cubePositions.putIfAbsent(cubeB, new HashMap<>());


            cubePositions.get(cubeA).put(direction, cubeB);
            cubePositions.get(cubeB).put(oppositeDirection(direction), cubeA);
        }


        for (int cubeA : cubePositions.keySet()) {
            Map<String, Integer> directions = cubePositions.get(cubeA);
            for (String direction : directions.keySet()) {
                int cubeB = directions.get(direction);

                String commonSide = getCommonSide(cubeA, cubeB, direction);
                commonSides.add(commonSide);
            }
        }


        System.out.println(commonSides.size());
        sc.close();
    }


    static String getCommonSide(int cubeA, int cubeB, String direction) {
        int smaller = Math.min(cubeA, cubeB);
        int larger = Math.max(cubeA, cubeB);
        return smaller + "-" + larger + "-" + direction;
    }


    static String oppositeDirection(String direction) {
        switch (direction) {
            case "left": return "right";
            case "right": return "left";
            case "top": return "down";
            case "down": return "top";
            default: return "";
        }
    }
}
