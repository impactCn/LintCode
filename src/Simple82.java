/**
 * @program: Lincode
 * @description:
 * @author: SY_zheng
 * @create: 2019-03-21
 */
public class Simple82 {

    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        // 根据异或运算原理 T^(T^n)=n
        // 且 0 ^ T = T, T ^ T = 0
        if (A == null || A.length == 0) {
            return -1;
        }
        int rst = 0;
        for (int i = 0; i < A.length; i++) {
            rst ^= A[i];
        }
        return rst;
    }
}
