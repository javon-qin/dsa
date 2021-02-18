package cn.javon.dsa.a.leetcode.array;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class No35 {

    public static void main(String[] args) {
        No35 tester = new No35();

        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        System.out.println(tester.searchInsert(nums, target));

        target = 2;
        System.out.println(tester.searchInsert(nums, target));

        target = 7;
        System.out.println(tester.searchInsert(nums, target));

        target = 0;
        System.out.println(tester.searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int result = -1;

        if (nums[0] >= target) {
            result = 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (target > nums[i - 1] && target <= nums[i]) {
                result = i;
                break;
            }
        }

        if (result == -1) {
            result = nums.length;
        }

        return result;
    }

}
