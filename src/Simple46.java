import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: LintCode
 * @description: 给定一个整型数组，找出主元素，
 *                它在数组中的出现次数严格大于数组元素个数的二分之一
 * @author: SY_zheng
 * @create: 2019-02-26
 */
public class Simple46 {

    public static void main(String[] args) {
        Simple46 simple46 = new Simple46();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(simple46.majorityNumber(list));
    }

    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(List<Integer> nums) {
        // write your code here

        int count = 0;
        int temp = nums.get(0);
        for (int a: nums) {
            if (a == temp) {
                count++;
            } else {
                count = 0;
                temp = a;
            }

            if (count > (nums.size() / 2)) {
                break;
            }
        }

        return temp;

    }
}