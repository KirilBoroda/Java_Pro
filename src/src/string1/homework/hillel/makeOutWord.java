package string1.homework.hillel;

public class makeOutWord {
    public static String makeOutWord(String out, String word) {
        String str1 = out;


        return str1.substring(0,2) + word +str1.substring(2,4) ;
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>","Kyryl"));
    }
}
