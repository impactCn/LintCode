import java.util.Arrays;

/**
 * @program: LintCode
 * @description: 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。
                  如果没有，返回到它将会被按顺序插入的位置。
                  你可以假设在数组中无重复元素。
 * @author: SY_zheng
 * @create: 2019-03-06
 */
public class Simple60 {

    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }

        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == target) {
                end = mid;
            } else if (A[mid] < target) {
                start = mid;
                // or start = mid + 1
            } else {
                end = mid;
                // or end = mid - 1
            }
        }

        if (A[start] >= target) {
            return start;
        } else if (A[end] >= target) {
            return end;
        } else {
            return end + 1;
        }




    }

}