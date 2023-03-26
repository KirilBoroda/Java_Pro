package algo.hillel;

import java.util.Arrays;

public class AlgoInsert {
    public static void main(String[] args) {
        var ints =doArray(100);
        System.out.println(Arrays.toString(ints));
        var sort = insertSort(ints);
        System.out.println(Arrays.toString(ints));
    }
    private  static  int[] insertSort(int[] ints){
        for(int i=1;i<ints.length;i++){
            int current = ints[i];
            int j =i;
            while (j>0 && ints[j-1]>current){
                ints[j] = ints[j-1];
                j--;
            }
            ints[j] = current;

        }
        return ints;
    }
    private static int[] doArray(int size){
        int[] ints =new int[size];
        for (int i=0;i<ints.length;i++){

            ints[i] = (int)(Math.random()*100);

        }
        return ints;
    }
}
