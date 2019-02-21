import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/2/4.
 * LintCode
 * 级别：简单
 * 题目：给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
        如果这个数被3整除，打印fizz.
        如果这个数被5整除，打印buzz.
        如果这个数能同时被3和5整除，打印fizz buzz.
        如果这个数既不能被 3 整除也不能被 5 整除，打印数字本身。
 */
public class Simple09 {

    public static void main(String[] args) {
        Simple09 simple9 = new Simple09();
        System.out.println(simple9.fizzBuzz(15));
    }


    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        String s = null;
        List<String> list = new ArrayList();
        // 大条件写在前，小条件写后
        for (int i = 1; i <= n; i++) {
            s = ((i%5 == 0) && (i%3 == 0))? "fizz buzz":
                    (i%3 == 0)? "fizz":
                            (i%5 == 0)? "buzz": String.valueOf(i);
            list.add(s);
        }
        return list;

    }
}
