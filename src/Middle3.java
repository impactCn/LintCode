/**
 * Created by Administrator on 2019/2/3.
 * LintCode
 * 级别：简单
 * 题目：计算数字k在0到n中的出现的次数，k可能是0~9的一个值
 */
public class Middle3 {


    public static void main(String[] args) {
        Middle3 middle3 = new Middle3();
        System.out.println(middle3.digitCounts(1, 19));
    }


    /**
     * @param k: An integer
     * @param n: An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here

        if (n < k) {
            return 0;
        }

        StringBuilder s = new StringBuilder();

        int count = 0;
        char c = String.valueOf(k).charAt(0);
        for (int i = k; i <= n; i++) {
            s.append(i);
        }
        System.out.println(s);
        char[] chars = s.toString().toCharArray();
        for (char b:chars) {
            if (b == c) {
                System.out.println(b);
                count++;
            }
        }
        return count;




    }
}
