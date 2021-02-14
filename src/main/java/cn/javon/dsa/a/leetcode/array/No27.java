package cn.javon.dsa.a.leetcode.array;

public class No27 {

    public static void main(String[] args) {
        No27 tester = new No27();

        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int result = tester.solution(nums, val);
        tester.print(nums, result);

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        result = tester.solution(nums, val);
        tester.print(nums, result);

        nums = new int[]{1};
        val = 1;
        result = tester.solution(nums, val);
        tester.print(nums, result);

        nums = new int[]{12, 2};
        val = 2;
        result = tester.solution(nums, val);
        tester.print(nums, result);
    }

    public int solution(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            while (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                length--;
                if (i >= length){
                    break;
                }
            }
        }
        return length;
    }

    public void print(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
}
