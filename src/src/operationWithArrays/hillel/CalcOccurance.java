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
        calcOccurance(words);


    }

    public static void calcOccurance(List<String> words) {
        Map<String, Integer> occuranceMap = new HashMap<>();
        for (String word : words) {
            if (occuranceMap.containsKey(word)) {
                occuranceMap.put(word, occuranceMap.get(word) + 1);
            } else {
                occuranceMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : occuranceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
