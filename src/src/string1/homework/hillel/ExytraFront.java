package string1.homework.hillel;

public class ExytraFront {
    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String firstTwo = str.substring(0, 2);
            return firstTwo + firstTwo + firstTwo;
        }
    }

    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }
}
