import java.util.List;

/**
 * @program: LintCode
 * @description: 给定一个字符串，逐个翻转字符串中的每个单词
 * @author: SY_zheng
 * @create: 2019-02-28
 */
public class Simple53 {

    public static void main(String[] args) {
        System.out.println(new Simple53().reverseWords("  Life  doesn't  always    give     us  the       joys we want."));
    }

    /**
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here

        if (!s.contains(" ")) {
            return s;
        }

        String[] list = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = list.length - 1; i >= 0; i--) {
            list[i].trim();
            if (("").equals(list[i])) {
                continue;
            }
            builder.append(list[i]);
            builder.append(" ");
        }
        return builder.toString();

    }
}