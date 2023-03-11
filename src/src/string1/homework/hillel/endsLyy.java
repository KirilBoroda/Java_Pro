package string1.homework.hillel;

public class endsLyy {
    public static boolean endsLy(String str) {
        int len = str.length();
        if (len < 2) {
            return false;
        }
        return str.substring(len-2).equals("ly");
    }

    public static void main(String[] args) {
        System.out.println(endsLy("Luly"));
        System.out.println(endsLy("adfasfd"));
        System.out.println(endsLy("SDadasly"));
    }
}
