package to.list.hillel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> test = ArrayToList.toList(array);
        System.out.println(test);
    }
}