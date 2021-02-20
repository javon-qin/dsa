package cn.javon.dsa.a.leetcode.array;

public class No1572 {

    public static void main(String[] args) {
        No1572 tester = new No1572();

        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(tester.diagonalSum(mat));

        mat = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println(tester.diagonalSum(mat));

        mat = new int[][]{{5}};
        System.out.println(tester.diagonalSum(mat));
    }


    public int diagonalSum(int[][] mat) {
        int result = 0;

        int length = mat.length;

        for (int i = 0; i < length; i++) {
            result += mat[i][i];
            result += mat[i][length - 1 - i];
        }

        if (length % 2 != 0) {
            int middleIndex = length / 2;
            result -= mat[middleIndex][middleIndex];
        }

        return result;
    }

}
