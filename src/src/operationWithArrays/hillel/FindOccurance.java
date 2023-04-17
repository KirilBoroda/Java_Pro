package operationWithArrays.hillel;

import java.util.*;

public class FindOccurance {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("bird", "cat", "dog", "bird", "fox", "cat", "cat", "dog", "bird");
        Map<String, Integer> occurrenceMap = findOccurrence(wordList);
        System.out.println("Word occurrence in the list:");
        for (String word : occurrenceMap.keySet()) {
            System.out.println(word + ": " + occurrenceMap.get(word));
        }
    }

    public static Map<String, Integer> findOccurrence(List<String> wordList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : wordList) {
            if (occurrenceMap.containsKey(word)) {
                occurrenceMap.put(word, occurrenceMap.get(word) + 1);
            } else {
                occurrenceMap.put(word, 1);
            }
        }
        return occurrenceMap;
    }
}
