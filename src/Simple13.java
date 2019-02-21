/**
 * Created by Administrator on 2019/2/5.
 * LintCode
 * 级别：简单
 * 题目：对于一个给定的 source 字符串和一个 target 字符串，
         你应该在 source 字符串中找出 target 字符串出现的
         第一个位置(从0开始)。如果不存在，则返回 -1。
 */
public class Simple13 {

    public static void main(String[] args) {
        Simple13 simple13 = new Simple13();
        System.out.println(simple13.strStr1("abcde", "e"));
    }


    /**
     * @param source:
     * @param target:
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        // 建议了解KMP算法
        // 暴力破解
        char[] c1 = source.toCharArray();
        char[] c2 = target.toCharArray();
        int i = 0;
        int j = 0;
        while (i < c1.length && j < c2.length) {
            if (c1[i] == c2[j]) {
                i++;
                j++;
            } else {
                i = i + 1 -j;
                j = 0;

            }
        }
        if (j == c2.length) {
            return i-j;
        } else {
            return -1;
        }
    }

    public int strStr1(String source, String target) {
        int n = -1;
        if(source.equals("")&&target.equals("")){
            return 0;
        }
        if(target.equals("")||target.equals(source)){
            return 0;
        }
        // Write your code here
        char[] c1 = source.toCharArray();
        char[] c2 = target.toCharArray();
        int j = 0;
        int c1len = c1.length;
        int c2len = c2.length;
        for (int k = 0; k < c1len; k++) {
            if (c1[k] == c2[j]) {
                if(c2len==1){
                    n = k;
                    return n;
                }
                for (int k1 = 1; k1 < c2len; k1++) {
                    if (k + k1>=c1len){
                        return -1;
                    }
                    if (c1[k + k1] != c2[k1] ) {
                        break;
                    }

                    if(c2len==k1+1){
                        n = k;
                        return n;
                    }
                    j++;
                    k = k1;
                }
            }
            j = 0;
        }
        return n;
    }




}
