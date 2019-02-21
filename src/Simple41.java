
/**
 * Created by Administrator on 2019/2/13.
 * LintCode
 * 级别：简单
 * 题目：给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。
 */
public class Simple41 {

    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sumMax = nums[0];
        int currentMax = nums[0];//保存子数组相加之和
        //从头开始遍历相加数组中的元素
        for (int i = 1; i < nums.length; i++) {
            //若是相加之和一旦小于零，子数组从新开始，否则相加
            if (currentMax < 0) {
                currentMax = nums[i];
            } else {
                currentMax = currentMax + nums[i];
            }
            //sumMax保存最大的子数组的和
            if (currentMax > sumMax) {
                sumMax = currentMax;
            }

        }
        return sumMax;

    }
}
