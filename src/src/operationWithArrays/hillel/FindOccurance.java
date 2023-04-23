package operationWithArrays.hillel;

import java.util.*;

public class FindOccurance {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("bird", "cat", "dog", "bird", "fox", "cat", "cat", "dog", "bird");
        List<WordOccurrence> occurrenceList = findOccurrence(wordList);
        System.out.println("Word occurrence in the list:");
        System.out.println(occurrenceList);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordOccurrence that = (WordOccurrence) o;

        if (occurrence != that.occurrence) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + occurrence;
        return result;
    }

    @Override
    public String toString() {
        return "WordOccurrence{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}