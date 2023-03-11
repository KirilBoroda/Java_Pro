package string1.homework.hillel;

public class MidThree {
    public static String middleThree(String str) {
        int len = str.length();
        int midIndex = len / 2;
        return str.substring(midIndex - 1, midIndex + 2);
    }

    public static void main(String[] args) {
        System.out.println(middleThree("Homework"));
    }

}
