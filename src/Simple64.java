/**
 * @program: LintCode
 * @description: 合并两个排序的整数数组A和B变成一个新的数组。
 * @author: SY_zheng
 * @create: 2019-03-07
 */
public class Simple64 {

    public static void main(String[] args) {
        Simple64 simple64 = new Simple64();
        int[] ints = new int[]{1, 2, 3, 0, 0};
        simple64.mergeSortedArray(new int[]{1, 2, 3}, 3, new int[]{4, 5}, 2);

    }

    /**
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        // 第一种思路先取出所有，在进行快速排序，效率低，待优化
//        for (int i = 0; i < B.length; i++) {
//
//            A[A.length - n + i] = B[i];
//            System.out.println(A[A.length - n + i]);
//        }
//        quickSort(A, 0, A.length - 1);

        // 第二种思路，设置i和j双指针，分别从两个数组的尾部从头部移动
        // 并判断A[i]和B[j]的大小关系，从而保证数组始终有序，同时每次index从尾部向头部移动

        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[index--] = A[i--];
            } else {
                A[index--] = B[j--];
            }
        }
        while (i >= 0) {
            A[index--] = A[i--];
        }
        while (j >= 0) {
            A[index--] = B[j--];
        }
    }

//    private void quickSort(int[] nums, int low, int high) {
//        int i, j, temp, t;
//        if (low > high) {
//            return;
//        }
//
//        i = low;
//        j = high;
//        // temp就是基准位
//        temp = nums[low];
//
//        while (i < j) {
//            // 先看右边，依此往左递减
//            while (temp <= nums[j] && i < j) {
//                j--;
//            }
//            // 再看左边，一次往右递增
//            while (temp >= nums[i] && i < j) {
//                i++;
//            }
//
//            // 如果满足条件则交换
//            if (i < j) {
//                t = nums[j];
//                nums[j] = nums[i];
//                nums[i] = t;
//            }
//        }
//        // 最后将基准为与i与j相等位置的数字交换
//        nums[low] = nums[i];
//        nums[i] = temp;
//        // 递归调用左半数组
//        quickSort(nums, low, j-1);
//        quickSort(nums, j+1, high);
//    }
}