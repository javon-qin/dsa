package cn.javon.dsa.a.leetcode.math;

/**
 * @Description TODO
 * @Author qinjiangwei
 * @Date 2021/2/23
 * @Version 1.0
 */
public class No7 {

    public static void main(String[] args) {
        No7 tester = new No7();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(tester.reverse(123));

        System.out.println(tester.reverse(-123));

        System.out.println(tester.reverse(120));

        System.out.println(tester.reverse(0));

        System.out.println(tester.reverse(2147483647));
    }

    public int reverse(int num) {
        int result = 0;

        while (num != 0) {
            int pop = num % 10;
            num /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            result = result * 10 + pop;
        }

        return result;
    }

}
