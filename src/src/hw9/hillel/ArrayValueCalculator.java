package hw9.hillel;

public class ArrayValueCalculator {

    public static int doCalc(String[][] arr)  {
        if (arr.length != 4) {
            throw new ArraySizeException("Array size must be 4x4.");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new ArraySizeException("Array size must be 4x4.");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at row " + i + ", column " + j + ".");

                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        int result = 0;
        result = doCalc(arr);
        System.out.println("Result: " + result);
    }
}
