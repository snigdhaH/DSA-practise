import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

        // Create a HashMap to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Loop through the array
        for (int num : arr) {
            // If number already exists, increment its count
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // Else, set count to 1
                frequencyMap.put(num, 1);
            }
        }

        // Print the frequencies
        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
    }
}
