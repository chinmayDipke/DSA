package Questions;

import java.util.HashMap;
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

        System.out.println(destCity(paths));
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
    public String destCity2(List<List<String>> paths) {
        HashSet<String> cities = new HashSet<>();
        HashMap<String, String> mp = new HashMap<>();
        String dest = "";

        for(List<String> path: paths){
            cities.add(path.get(0));
            cities.add(path.get(1));
            mp.put(path.get(0), path.get(1));

        }
        for(String city: cities){
            if(mp.containsKey(city) == false){
                dest = city;
                break;
            }

        }
        return dest;
    }
}
