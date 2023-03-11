package recursion1.homework.hillel;

public class Array {
    public static int array11(int[] nums, int index) {
    if (index >= nums.length) {
        return 0;
    } else if (nums[index] == 11) {
        return 1 + array11(nums, index + 1);
    } else {
        return array11(nums, index + 1);
    }
}

    public static void main(String[] args) {
        int[] nums = {1, 2, 11, 11, 3, 11, 4};
        int count = array11(nums, 0);
        System.out.println( count);
    }
}
