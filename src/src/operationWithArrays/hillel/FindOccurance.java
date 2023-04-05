package operationWithArrays.hillel;

import java.util.*;

public class FindOccurance {
    public static void main(String[] args) {

        List<String> wordList = Arrays.asList("bird", "cat", "dog", "bird", "fox", "cat", "cat", "dog", "bird");
        List<Map<String, Object>> occurrenceList = findOccurrence(wordList);
        System.out.println("Word occurrence in the list:");
        for (Map<String, Object> occurrence : occurrenceList) {
            System.out.println(occurrence.get("name") + ": " + occurrence.get("occurrence"));
        }
    }


    public static List<Map<String, Object>> findOccurrence(List<String> wordList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : wordList) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }
        List<Map<String, Object>> occurrenceList = new ArrayList<>();
        for (String key : occurrenceMap.keySet()) {
            Map<String, Object> occurrence = new HashMap<>();
            occurrence.put("name", key);
            occurrence.put("occurrence", occurrenceMap.get(key));
            occurrenceList.add(occurrence);
        }
        return occurrenceList;
    }
}
