package operationWithArrays.hillel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalcOccurance {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Alua");
        words.add("Alua");
        words.add("Kavio");
        words.add("Alua");
        words.add("Kavio");
        words.add("Alua");
        words.add("Alua");

        Map<String, Integer> occurrenceMap = calcOccurrence(words);
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> calcOccurrence(List<String> words) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : words) {
            if (occurrenceMap.containsKey(word)) {
                occurrenceMap.put(word, occurrenceMap.get(word) + 1);
            } else {
                occurrenceMap.put(word, 1);
            }
        }
        return occurrenceMap;
    }
}




