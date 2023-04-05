package operationWithArrays.hillel;

import java.util.ArrayList;
import java.util.List;

public class CountOccurance {


    public static void main(String[] args) {
        String target = "apple";

        List<String> word = new ArrayList<>();
        word.add("apple");
        word.add("apple");
        word.add("grande");
        word.add("pencil");
        word.add("apple");
        word.add("book");
        var test = countMeter(word, target);
        System.out.println(test);
    }

    public static int countMeter(List<String> word, String target) {
        int count = 0;
        for (String elements : word) {
            if (elements.equals(target)) {
                count++;
            }

        }
        return count;
    }
}
