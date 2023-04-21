package operationWithArrays.hillel;

import java.util.*;

public class FindOccurance {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("bird", "cat", "dog", "bird", "fox", "cat", "cat", "dog", "bird");
        List<WordOccurrence> occurrenceList = findOccurrence(wordList);
        System.out.println("Word occurrence in the list:");
        for (WordOccurrence occurrence : occurrenceList) {
            System.out.println(occurrence.getName() + ": " + occurrence.getOccurrence());
        }
    }

    public static List<WordOccurrence> findOccurrence(List<String> wordList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : wordList) {
            if (occurrenceMap.containsKey(word)) {
                occurrenceMap.put(word, occurrenceMap.get(word) + 1);
            } else {
                occurrenceMap.put(word, 1);
            }
        }
        List<WordOccurrence> occurrenceList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            occurrenceList.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return occurrenceList;
    }
}

class WordOccurrence {
    private String name;
    private int occurrence;

    public WordOccurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public String getName() {
        return name;
    }

    public int getOccurrence() {
        return occurrence;

    }

    @Override
    public String toString() {
        return "WordOccurrence{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}