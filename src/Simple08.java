/**
 * Created by Administrator on 2019/2/3.
 * LintCode
 * 级别：简单
 * 题目：给定一个字符串（以字符数组的形式给出）和一个偏移量，根据偏移量原地旋转字符串(从左向右旋转)
 */
public class Simple08 {


    public static void main(String[] args) {


        Simple08 simple8 = new Simple08();
        simple8.rotateString("".toCharArray(), 10);

        System.out.println();
    }


    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here

        if (offset == 0 || offset == str.length || str.length == 0) {
            return;
        }
        if (offset > str.length) {
            offset = offset % str.length;

        }

        char[] c = new char[str.length];
        String temp;
        for (int i = 0; i < str.length; i++) {
            if (i - offset < 0) {
                c[i] = str[str.length - offset + i];
            } else {
                c[i] = str[i-offset];
            }
        }
        for (int i = 0; i < str.length; i++) {
            str[i] = c[i];
        }



    }
}
