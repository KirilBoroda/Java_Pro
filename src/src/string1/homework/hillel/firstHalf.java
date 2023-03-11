package string1.homework.hillel;

public class firstHalf {
    public static String firstHalf(String str) {
        int len = str.length() /2 ;
      return str.substring(0,len);
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("HelloThere"));
    }
}
