package recursion2.homework.hillel;

public class GroupSum {
    public static boolean groupSum(int start, int[] nums, int target) {

        if (target == 0) {
            return true;
        }
        if (start >= nums.length) {
            return false;
        }
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (groupSum(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={2,4,8};
        System.out.println(groupSum(0,nums,10));
    }

}
