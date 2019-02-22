import java.util.Iterator;
import java.util.List;

/**
 * @program: LintCode
 * @description: 给定一个整数数组，找到一个具有最小和的子数组。返回其最小和
 * @author: SY_zheng
 * @create: 2019-02-22
 */
public class Simple44 {

    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {

        if (nums == null || nums.size() == 0) {
            return 0;
        }

        // write your code here
        // 消耗时间过长
//        int sumMin = nums.get(0);
//        int currentMin = nums.get(0);
//        for (int i = 1; i < nums.size(); i++) {
//            // 若是相加之和一旦大于零，子数组从新开始，否则相加
//            if (currentMin > 0) {
//                currentMin = nums.get(i);
//            } else {
//                currentMin = currentMin + nums.get(i);
//            }
//
//            if (sumMin > currentMin) {
//                sumMin = currentMin;
//            }
//
//        }
//        return sumMin;
        // 优化部分
        Iterator<Integer> iterator = nums.iterator();
        int minSum = Integer.MAX_VALUE;
        int maxSum = 0;
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
            minSum = Math.min(minSum, sum - maxSum);
            maxSum = Math.max(maxSum, sum);
        }

        return minSum;


    }
}