package recursion1.homework.hillel;

public class CountABC {
    public static int countAbc(String str) {
    if (str.length() < 3) {
        return 0;
    }
    if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
        return 1 + countAbc(str.substring(1));
    }
    else {
        return countAbc(str.substring(1));
    }
}

    public static void main(String[] args) {
        String str = "abcxxabc";
        int count = countAbc(str);
        System.out.println(count);
    }

}
