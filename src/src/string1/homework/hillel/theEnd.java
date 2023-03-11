package string1.homework.hillel;

public class theEnd {
    public static String ttheEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(ttheEnd("Hello",true));
        System.out.println(ttheEnd("Hello",false));
    }
}
