import java.math.BigDecimal;

/**
 * Created by Administrator on 2019/2/1.
 * LintCode
 * 级别：简单
 * 题目：设计一个算法，计算出n阶乘中尾部零的个数
 */
public class Simple2 {



    public static void main(String[] args) {
        Simple2 simple2 = new Simple2();

        System.out.println(simple2.trailingZeros(110));
    }

    /*
    * @param n: An integer
    * @return: An integer, denote the number of trailing zeros in n!
    */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
//        BigDecimal result = new BigDecimal(1);
//        long count = 0;
//        for (long i = n; i >= 1; i--) {
//            BigDecimal i_value= new BigDecimal(i);
//            result = i_value.multiply(result);
//        }
//        char[] c = result.toString().toCharArray();
//        if (c[c.length-1] == '0') {
//
//            for (int i = c.length-1; i >= 0; i--) {
//                if (c[i] == '0') {
//                    count++;
//                } else if (c[i] != '0') {
//                    break;
//                }
//            }
//            return count;
//        } else {
//            return 0;
//        }



        // 寻找5的倍数
        // 当约数越大5的倍数就越多，这个算法都不适合了
//            int count=0;
//            for(int i=5;n/i>0;i*=5){
//                count+=n/i;
//            }
//            return count;

        // 穷举5的倍数
        long sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;


    }
}
