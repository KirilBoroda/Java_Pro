package recursion1.homework.hillel;

public class Count {

    public static int count7(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    public static void main(String[] args) {
        int n = 717;
        int result = count7(n);
        System.out.println( result );
    }
}