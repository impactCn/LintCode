/**
 * Created by Administrator on 2019/2/1.
 * LintCode
 * 级别：简单
 * 题目：给出两个整数 a 和 b , 求他们的和。
 */
public class Simple1 {

    /**
     * @param a
     * @param b
     * @return 返回a + b 的和
     */
    public int aplusb(int a, int b) {
        // write your code here

        //
           if (b == 0) {
               return a;
           } else {
               return aplusb(a^b, (a&b) << 1);
           }


    }
}
