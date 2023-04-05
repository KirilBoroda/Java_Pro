package algo.hillel;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        var ints = ArrayUtils.doArray(100);
        System.out.println(Arrays.toString(ints));
        var sort = insertSort(ints);
        System.out.println(Arrays.toString(ints));
    }
    private  static  int[] insertSort(int[] ints){
        for(int i=1;i<ints.length;i++){
            int current = ints[i];
            int j =i-1;
            while (j>0 && ints[j-1]>current){
                ints[j] = ints[j-1];
                j--;
            }
            ints[j] = current;

        }
        return ints;
    }

}
