package cn.javon.dsa.a.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qinjiangwei
 * @version 1.0
 * @description TODO
 * @date 2021/3/2
 */
public class No66 {

    public static void main(String[] args) {

        No66 tester = new No66();

        int[] digits = new int[]{1, 2, 3};
        int[] result = tester.plusOne(digits);
        System.out.println(Arrays.toString(result));

        digits = new int[]{4, 3, 2, 1};
        result = tester.plusOne(digits);
        System.out.println(Arrays.toString(result));

        digits = new int[]{0};
        result = tester.plusOne(digits);
        System.out.println(Arrays.toString(result));

        digits = new int[]{9, 9, 9};
        result = tester.plusOne(digits);
        System.out.println(Arrays.toString(result));

        digits = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        result = tester.plusOne(digits);
        System.out.println(Arrays.toString(result));

        digits = new int[]{9};
        result = tester.plusOne(digits);
        System.out.println(Arrays.toString(result));
    }

    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];

        boolean nextFlag = false;
        int temp = digits[digits.length - 1] + 1;
        if (temp == 10){
            temp = 0;
            nextFlag = true;
        }
        result[digits.length - 1] = temp;

        for (int i = digits.length - 2; i >= 0; i--) {
            temp = digits[i];
            if (nextFlag == true ){
                temp += 1;
            }
            if (temp == 10){
                temp = 0;
                nextFlag = true;
            }else{
                nextFlag = false;
            }
            result[i] = temp;
        }

        if (nextFlag){
            int[] newResult = new int[digits.length + 1];
            newResult[0] = 1;
            for (int i = 0; i < result.length; i++) {
                newResult[i + 1] = result[i];
            }
            result = newResult;
        }
        return result;
    }


    public int[] plusOneBak(int[] digits) {

        Integer originalNum = 0;
        for (int i = 0; i < digits.length; i++) {
            originalNum = originalNum * 10 + digits[i];
        }

        Integer resultNum = originalNum + 1;
        List<Integer> resultList = new ArrayList<>();
        while (resultNum != 0) {
            Integer pop = resultNum % 10;
            resultList.add(pop);
            resultNum /= 10;
        }

        int lenght = resultList.size();
        int[] result = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            result[i] = resultList.get(lenght - 1 - i);
        }

        return result;
    }
}
