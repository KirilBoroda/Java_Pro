package algo.hillel;

import java.util.Arrays;

public class AlgoBuble {
    public static void main(String[] args) {
        var ints =doArray(100);
        System.out.println(Arrays.toString(ints));
        var sort = bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }
    private static int[] bubbleSort(int[] ints){
        int buffer;
        for (int i=0;i<ints.length;i++){
            for (int j=0;j<ints.length-1;j++){
                if(ints[j]>ints[j+1]){
                    buffer=ints[j];
                    ints[j]=ints[j+1];
                    ints[j+1]=buffer;
                }
            }
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
