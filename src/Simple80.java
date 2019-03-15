/**
 * @program: LintCode
 * @description: 给定一个未排序的整数数组，找到其中位数。
 *                中位数是排序后数组的中间值，如果数组的个数是偶数个，则返回排序后数组的第N/2个数。
 * @author: SY_zheng
 * @create: 2019-03-15
 */
public class Simple80 {

    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        quickSort(nums, 0, nums.length - 1);
        if (nums.length % 2 == 0) {
            return nums[nums.length / 2 - 1];
        } else {
            return nums[nums.length / 2];
        }
    }

    /**
     * 快速排序
     * @param nums
     * @param low
     * @param high
     */
    private void quickSort(int[] nums, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        // temp基准位
        temp = nums[low];

        while (i < j) {
            // 先看右边， 依此往左递减
            while (temp <= nums[j] && i < j) {
                j--;
            }
            // 再看左边，一次往右递增
            while (temp >= nums[i] && i < j) {
                i++;
            }
            // 如果满足条件则交换
            if (i < j) {
                t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }
        }

        // 最后将基准为与i与j相等位置的数字交换
        nums[low] = nums[i];
        nums[i] = temp;
        // 递归调用左半数组
        quickSort(nums, low, j-1);
        quickSort(nums, j+1, high);
    }
}