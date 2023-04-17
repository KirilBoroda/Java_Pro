package operationWithArrays.hillel;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 34, 23, 4, 231, 32};
        var test = toList(ints);
        System.out.println(test);

    }

    public static <T> List<T> toList(T[] ints) {
        List<T> array = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            array.add(ints[i]);
        }
        return array;
    }
}
