package cn.javon.dsa.a.leetcode.array;

/**
 * @Description 1295. 统计位数为偶数的数字[https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/]
 * @Author qinjiangwei
 * @Date 2021/2/19
 * @Version 1.0
 */
public class No1295 {

    public static void main(String[] args) {

        No1295 tester = new No1295();

        int[] nums = new int[]{12, 345, 2, 6, 7896};
        System.out.println(tester.findNumbers(nums));

        nums = new int[]{555, 901, 482, 1771};
        System.out.println(tester.findNumbers(nums));

    }

    public int findNumbers(int[] nums) {
        int numberCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                numberCount++;
            }
        }

        return numberCount;
    }
}
