import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @description:给定一个整数数组A。
                 定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]，
                 计算B的时候请不要使用除法。请输出B。
 * @author: SY_zheng
 * @create: 2019-02-27
 */
public class Simple50 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Simple50 simple50 = new Simple50();
        System.out.println(simple50.productExcludeItself(list));
    }

    /**
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        List<Long> list = new ArrayList<>();
        if (nums.size() == 1) {
            list.add((long)1);
            return list;
        }

        for (int i = 0; i < nums.size(); i++) {
            long sum = 1;
            for (int j = 0; j < nums.size(); j++) {
                if (j == i) {
                    continue;
                }
                sum = sum * nums.get(j);
            }
            list.add(sum);
        }

        return list;
    }
}