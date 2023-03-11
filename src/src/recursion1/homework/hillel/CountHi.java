package recursion1.homework.hillel;

public  class CountHi {
    public static int countHi2(String str) {
        int n = str.length();
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            if (str.equals("hi")) {
                return 1;
            }
            return 0;
        }
        if (str.substring(n-2, n).equals("hi")) {
            if (str.charAt(n-3) != 'x') {
                return 1 + countHi2(str.substring(0, n-1));
            }
            return countHi2(str.substring(0, n-1));
        }
        return countHi2(str.substring(0, n-1));
    }

    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
    }
}
