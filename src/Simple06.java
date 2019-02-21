/**
 * Created by Administrator on 2019/2/2.
 * LintCode
 * 级别：简单
 * 题目：合并两个排序的整数数组A和B变成一个新的数组。新数组也要有序。
 */
public class Simple06 {


    public static void main(String[] args) {

        Simple06 simple6 = new Simple06();
        int[] A = new int[]{1, 2, 3, 5,5};
        int[] B = new int[]{2, 4, 2, 6};
        simple6.mergeSortedArray(A, B);
    }

    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here

        int[] C = new int[A.length + B.length];
        int temp;
        // 比较A B数组的大小
        if (A.length >= B.length) {
            // 融合数组
            for (int i = 0; i < A.length; i++) {

                C[i] = A[i];
                if (i < B.length) {
                    C[A.length + i] = B[i];
                }

            }

        } else {

            for (int i = 0; i < B.length; i++) {

                C[i] = B[i];
                if (i < A.length) {
                    C[B.length + i] = A[i];
                }

            }

        }

        // 冒泡排序
        for (int i = 0; i < C.length-1; i++) {
            for (int j = 0; j < C.length - 1 - i; j++) {
                if (C[j] > C[j+1]) {
                    temp = C[j];
                    C[j] = C[j+1];
                    C[j+1] = temp;
                }
            }
        }

        return C;
    }
}
