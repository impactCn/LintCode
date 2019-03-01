/**
 * @program: LintCode
 * @description: 比较两个字符串A和B，确定A中是否包含B中所有的字符。
                  字符串A和B中的字符都是
 * @author: SY_zheng
 * @create: 2019-03-01
 */
public class Simple55 {

    public static void main(String[] args) {

        Simple55 simple55 = new Simple55();
        System.out.println("".length());

    }

    /**
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here

//        for (int i = 0; i < B.length(); i++) {
//            if (A.contains(String.valueOf(B.charAt(i)))) {
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;

        // counts首先记录A中所有字符以及它们的个数，然后遍历B。
        // 如果出现counts[i]小于0的情况，说明B中该字符出现的次数

        // 大于在A中出现的次数
        int[] counts = new int[26];
        // 初始化数组
        for (int i = 0; i < 26; i++) {
            counts[i] = 0;
        }

        for (int i = 0; i < A.length(); i++) {
            counts[A.charAt(i) - 'A'] ++;
        }

        for (int i = 0; i < B.length(); i++) {
            counts[B.charAt(i) - 'A'] --;
            if (counts[B.charAt(i) - 'A'] < 0) {
                return false;
            }
        }
        return true;
    }
}