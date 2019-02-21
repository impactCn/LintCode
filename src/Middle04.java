import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/10.
 * LintCode
 * 级别：简单
 * 题目：设计一个算法，找出只含素因子2，3，5 的第 n 小的数。
 */
public class Middle04 {


    public static void main(String[] args) {
        Middle04 middle4 = new Middle04();
        System.out.println(middle4.nthUglyNumber(9));
    }

    /**
     * @param n: An integer
     * @return: return a  integer as description.
     */
    public int nthUglyNumber(int n) {
        // write your code here
        if (n <= 0) {
            return 0;
        }
        int[] ints = new int[n];
        List<Integer> list = new ArrayList<>();
        list.add(0, 1);
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int nextNum = 1;

        while (nextNum < n) {
            int min = Math.min(Math.min(list.get(temp1) * 2, list.get(temp2) * 3), list.get(temp3) * 5);
             list.add(nextNum, min);

            while (list.get(temp1) * 2 <= min)
                temp1++;
            while (list.get(temp2) * 3 <= min)
                temp2++;
            while (list.get(temp3) * 5 <= min)
                temp3++;
            nextNum++;
        }
        return list.get(n -1);
    }
}
