package recursion1.homework.hillel;

public class ChangeP {
    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "xpixpipi";
        String result = changePi(str);
        System.out.println( result);
    }
}
