package operationWithArrays.hillel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        var test = findUnique(numbers);
        System.out.println(test);
    }

    public static Set<Integer> findUnique(List<Integer> listNum) {
        return new HashSet<>(listNum);
    }
}
