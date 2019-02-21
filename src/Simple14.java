/**
 * Created by Administrator on 2019/2/6.
 * LintCode
 * 级别：简单
 * 题目：给定一个排序的整数数组（升序）和一个要查找的整数target，
         用O(logn)的时间查找到target第一次出现的下标（从0开始），
         如果target不存在于数组中，返回-1。
 */
public class Simple14 {

    public static void main(String[] args) {
        Simple14 simple14 = new Simple14();
        int[] ints = new int[]{1,4,4,5,7,7,8,9,9,10};
        System.out.println(simple14.binarySearch(ints, 10));
    }


    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here

//        int start = 0;
//        int end = nums.length - 1;
//        int place = -1;
//
//        int middle = (start + (end - start)) / 2;
//
//        while (target != nums[middle]) {
//            middle = (start + (end - start)) / 2;
//            if (target < nums[middle]) {
//                end = middle - 1;
//            } else if (target > nums[middle]) {
//                start = middle + 1;
//            } else {
//                place =  middle;
//                break;
//            }
//
//            if (nums[start] == target) {
//                place = start;
//                break;
//            }
//            if (nums[end] == target) {
//                place = end;
//                break;
//            }
//
//        }
//
//        return place;

        int lowerBound = 0;
        int upperBound = nums.length - 1;
        int middle;

        while (true) {
            middle = (lowerBound + upperBound) / 2;
            if (nums[middle] == target) {
                for (int i = 0; i <= middle; i++) {
                    if (nums[i] == target) {
                        return i;
                    }
                }
            } else if (lowerBound > upperBound) {
                return -1;
            } else {
                if (nums[middle] < target) {
                    lowerBound = middle + 1;
                } else {
                    upperBound = middle - 1;
                }
            }
        }


    }
}
