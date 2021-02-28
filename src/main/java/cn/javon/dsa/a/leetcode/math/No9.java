package cn.javon.dsa.a.leetcode.math;

/**
 * @author qinjiangwei
 * @version 1.0
 * @description LeetCode - 9
 * @date 2021/2/25
 */
public class No9 {

    public static void main(String[] args) {

        No9 tester = new No9();

        System.out.println(tester.isPalindrome(-123));

        System.out.println(tester.isPalindrome(121));

        System.out.println(tester.isPalindrome(-121));

        System.out.println(tester.isPalindrome(10));

        System.out.println(tester.isPalindrome(-101));

        System.out.println(tester.isPalindrome(0));
    }


    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int temp = x;
            int palindromeNum = 0;
            while (temp > 0) {
                int pop = temp % 10;
                temp /= 10;
                palindromeNum = palindromeNum * 10 + pop;
            }

            if (palindromeNum == x) {
                return true;
            } else {
                return false;
            }
        }
    }

}
