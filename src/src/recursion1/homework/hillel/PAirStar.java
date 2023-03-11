package recursion1.homework.hillel;

public class PAirStar {
    public static String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        String newStr = pairStar(str);
        System.out.println( newStr);
    }
}
