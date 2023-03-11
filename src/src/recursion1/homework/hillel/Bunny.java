package recursion1.homework.hillel;

public class Bunny {
    public static int bunnyEars2(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return 3 + bunnyEars2(n - 1);
        } else {
            return 2 + bunnyEars2(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int result = bunnyEars2(n);
        System.out.println("Total ears for " + n + " bunnies is " + result);
    }
}
