package algo.hillel;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        var ints =ArrayUtils.doArray(100);
        System.out.println(Arrays.toString(ints));
        var sort = bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }
    private static int[] bubbleSort(int[] ints){
        int buffer;
        for (int i=0;i<ints.length;i++){
            for (int j=0;j<ints.length-1-i;j++){
                if(ints[j]>ints[j+1]){
                    buffer=ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=buffer;
                }
            }
        }
        return ints;
    }

}
