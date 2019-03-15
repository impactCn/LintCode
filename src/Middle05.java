/**
 * @program: Lintcode 中等
 * @description: 在数组中找到第 k 大的元素
 * @author: SY_zheng
 * @create: 2019-02-25
 */
public class Middle05 {

    public static void main(String[] args) {

        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        Middle05 middle05 = new Middle05();
        System.out.println(middle05.kthLargestElement(1, arr));

    }

    /**
     * @param n: An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public int kthLargestElement(int n, int[] nums) {
        // write your code here
        // 首先进行快速排序
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - n];
    }


    /**
     * 快速排序
     * @param nums
     * @param low
     * @param high
     */
    private void quickSort(int[] nums, int low, int high) {
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = nums[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=nums[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=nums[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        nums[low] = nums[i];
        nums[i] = temp;
        //递归调用左半数组
        quickSort(nums, low, j-1);
        //递归调用右半数组
        quickSort(nums, j+1, high);
    }


}
