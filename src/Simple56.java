/**
 * @program: LintCode
 * @description: 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
                  你需要实现的函数twoSum需要返回这两个数的下标,
                  并且第一个下标小于第二个下标。注意这里下标的范围是 0 到 n-1。
 * @author: SY_zheng
 * @create: 2019-03-05
 */
public class Simple56 {

    /**
     * @param numbers: An array of Integer
     * @param target:  target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] ints = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            int temp = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {

                if (temp + numbers[j] == target) {
                    ints[0] = i;
                    ints[1] = j;
                    break;
                } else {
                    continue;
                }
            }

        }
        return ints;

    }
}