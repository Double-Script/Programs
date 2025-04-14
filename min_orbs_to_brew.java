import java.util.*;

public class min_orbs_to_brew {
    // Memoization map to store already computed results
    private static Map<String, Integer> memo = new HashMap<>();

    public static int calculateOrbs(String potion, Map<String, List<List<String>>> recipeDict) {
        // If the potion is already computed, return its value
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }

        // Base case: If potion is not in the recipe dictionary, it's a base ingredient
        if (!recipeDict.containsKey(potion)) {
            memo.put(potion, 0);
            return 0;
        }

        int minOrbs = Integer.MAX_VALUE;

        // Calculate orbs for each recipe of the potion
        for (List<String> ingredients : recipeDict.get(potion)) {
            int currentOrbs = ingredients.size() - 1; // Orbs to combine the ingredients
            for (String ingredient : ingredients) {
                currentOrbs += calculateOrbs(ingredient, recipeDict);
            }
            minOrbs = Math.min(minOrbs, currentOrbs);
        }

        // Memoize and return the minimum orbs for this potion
        memo.put(potion, minOrbs);
        return minOrbs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of recipes
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<List<String>>> recipeDict = new HashMap<>();

        // Parse recipes
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("=");
            String potion = parts[0];
            String[] ingredients = parts[1].split("\\+");

            // Add the recipe to the dictionary
            recipeDict.putIfAbsent(potion, new ArrayList<>());
            recipeDict.get(potion).add(Arrays.asList(ingredients));
        }

        // Input the target potion
        String targetPotion = scanner.nextLine();

        // Compute the minimum orbs required
        int result = calculateOrbs(targetPotion, recipeDict);
        System.out.println(result);

        scanner.close();
    }
}
