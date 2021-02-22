package cn.javon.dsa.a.leetcode.hash;

import java.util.Arrays;

/**
 * @Description LeetCode - 1
 * @Author qinjiangwei
 * @Date 2021/2/22
 * @Version 1.0
 */
public class No1 {

    public static void main(String[] args) {
        No1 tester = new No1();

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(tester.twoSum(nums, target)));

        nums = new int[]{3, 2, 4};
        target = 6;
        System.out.println(Arrays.toString(tester.twoSum(nums, target)));

        nums = new int[]{3, 3};
        target = 6;
        System.out.println(Arrays.toString(tester.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = null;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i ; j--) {
                if (nums[i] + nums[j] == target){
                    result = new int[]{i, j};
                    break;
                }
            }
        }

        return result;
    }

}
