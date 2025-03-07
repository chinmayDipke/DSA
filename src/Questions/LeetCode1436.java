package Questions;

import java.util.List;
import java.util.HashSet;
import java.util.Arrays;

public class LeetCode1436 {
    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("London", "New York"),
                Arrays.asList("New York", "Lima"),
                Arrays.asList("Lima", "Sao Paulo")
        );

        System.out.println(destCity(paths)); // Expected output: "Sao Paulo"
    }

    public static String destCity(List<List<String>> paths) {
        HashSet<String> sourceCities = new HashSet<>();

        // Add all source cities to the HashSet
        for (List<String> path : paths) {
            sourceCities.add(path.get(0));
        }

        // Find the city that is not in the HashSet (i.e., never a source)
        for (List<String> path : paths) {
            if (!sourceCities.contains(path.get(1))) {
                return path.get(1);  // The final destination city
            }
        }

        return ""; // Should never reach here based on problem constraints
    }
}
