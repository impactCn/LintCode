/**
 * Created by Administrator on 2019/2/8.
 * LintCode
 * 级别：简单
 * 题目：写出一个高效的算法来搜索 m × n矩阵中的值。
         这个矩阵具有以下特性：
            每行中的整数从左到右是排序的。
            每行的第一个数大于上一行的最后一个整数。
 */
public class Simple28 {

    public static void main(String[] args) {
        Simple28 simple28 = new Simple28();
        int[][] ints = new int[][]{};
        System.out.println(ints.length == 0);
//        System.out.println(simple28.searchMatrix(ints, 1));
    }

    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        int row = 0;  // 行数
        int col = 0;  // 列数

        /**
         * 1、二维数组首地址是否为空，即array==null；

         2、二维数组是否为{}，即array.length==0的情况；

         3、二维数组是否为{{}}，即array.length=1&&array[0].length==0的情况；
         */
        if (matrix == null || matrix.length == 0 || (matrix.length == 1 && matrix[0].length == 0)) {
            return false;
        } else {
            row = matrix.length - 1;
            col = matrix[0].length - 1;
        }
        for (int i = 0; i <= row; i++) {
            if (matrix[i][col] > target) {
                for (int j = 0; j <= col; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            } else if (matrix[i][col] == target) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
}
