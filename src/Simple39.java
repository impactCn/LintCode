import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2019/2/13.
 * LintCode
 * 级别：简单
 * 题目：给定一个旋转排序数组，在原地恢复其排序。
 */
public class Simple39 {

    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        // 桶排序


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }

        // 桶数
        int bucketNum = (max - min) / nums.size() + 1;
        int[] bucketArr = new int[bucketNum];

        for (int i = 0; i < nums.size(); i++) {
            int mapPos = nums.get(i) - min;
            bucketArr[mapPos]++;
        }

        for (int i = 0; i < bucketArr.length; i++) {
            bucketArr[i] = bucketArr[i - 1] + bucketArr[i];
        }

        int res[] = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            int post = --bucketArr[nums.get(i) - min];
            res[post] = nums.get(i);
        }



    }
    
}
