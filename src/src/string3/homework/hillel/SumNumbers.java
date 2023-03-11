package string3.homework.hillel;

public class SumNumbers {
    public static int sumNumbers(String str) {
        int sum = 0;
        String number = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number += str.charAt(i);
            } else {
                if (!number.equals("")) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }
        if (!number.equals("")) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));
    }
}
