package recursion1.homework.hillel;

public class StrCount {
    public static int strCount(String str, String sub) {
        int n = str.length();
        int m = sub.length();

        if (n < m) {
            return 0;
        }
        if (str.substring(0, m).equals(sub)) {
            return 1 + strCount(str.substring(m), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }

    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
    }
}
