package recursion1.homework.hillel;

public class CountX {

        public static int countX(String str) {
            if (str.length() == 0) {
                return 0;
            } else if (str.charAt(0) == 'x') {
                return 1 + countX(str.substring(1));
            } else {
                return countX(str.substring(1));
            }
        }

        public static void main(String[] args) {
            String str = "xxhixx";
            int result = countX(str);
            System.out.println( result);
        }
    }

