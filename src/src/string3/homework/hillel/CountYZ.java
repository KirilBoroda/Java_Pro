package string3.homework.hillel;

public class CountYZ {
    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase() + " ";

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            char next = str.charAt(i+1);
            if ((ch == 'y' || ch == 'z') && !Character.isLetter(next)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
    }
}
