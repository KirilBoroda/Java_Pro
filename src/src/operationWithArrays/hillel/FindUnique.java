package operationWithArrays.hillel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>();
        listNum.add(2);
        listNum.add(2);
        listNum.add(8);
        listNum.add(3);
        listNum.add(2);
        listNum.add(2);
        listNum.add(1);
        listNum.add(2);
        listNum.add(5);
        listNum.add(1);
        var test = findUnique(listNum);
        System.out.println(test);
    }
    public static List<Integer> findUnique(List<Integer> listNum){
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> uniqueList =new ArrayList<>();
        for (Integer element:listNum){
            if(!uniqueSet.contains(element)){
                uniqueSet.add(element);
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }
}
