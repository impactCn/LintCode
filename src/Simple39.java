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
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code here
        for (int i = 0; i < nums.size() - 1; i++) {
            // 寻找第一个比后面大的数
            // 以[4, 5, 1, 2, 3]为例
            // 找到5，翻转[4, 5]得到[5, 4]
            // 翻转[1, 2, 3]得到[3, 2, 1]
            // 最后翻转[5, 4, 3, 2, 1]得到[1, 2, 3, 4, 5]
            if (nums.get(i) > nums.get(i + 1)) {
                reverse(nums, 0, i);
                reverse(nums, i + 1, nums.size() - 1);
                reverse(nums, 0, nums.size() - 1);
                return;
            }
        }
    }

    private void reverse(ArrayList<Integer> nums, int start, int end) {
        // 冒泡排序
        // 这里可以选择更优的排序方法
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = nums.get(i);
            nums.set(i, nums.get(j));
            nums.set(j, temp);
        }
    }
    
}
