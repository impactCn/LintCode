//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Administrator on 2019/2/7.
// * LintCode
// * 级别：简单
// * 题目：给定一个列表，该列表中的每个要素要么是个列表，
//         要么是整数。将其变成一个只包含整数的简单列表。
// */
//
//
///**
// * // This is the interface that allows for creating nested lists.
// * // You should not implement it, or speculate about its implementation
// * public interface NestedInteger {
// *
// *     // @return true if this NestedInteger holds a single integer,
// *     // rather than a nested list.
// *     public boolean isInteger();
// *
// *     // @return the single integer that this NestedInteger holds,
// *     // if it holds a single integer
// *     // Return null if this NestedInteger holds a nested list
// *     public Integer getInteger();
// *
// *     // @return the nested list that this NestedInteger holds,
// *     // if it holds a nested list
// *     // Return null if this NestedInteger holds a single integer
// *     public List<NestedInteger> getList();
// * }
// */
//public class Simple22 {
//
//    // @param nestedList a list of NestedInteger
//    // @return a list of integer
//
//    public List<Integer> list;
//
//    public List<Integer> flatten(List<NestedInteger> nestedList) {
//        list = new ArrayList<>();
//        nextListAdd(nestedList);
//        return list;
//    }
//
//    public void nextListAdd(List<NestedInteger> nestedList) {
//        for (NestedInteger nestedInteger: nestedList) {
//            if (nestedInteger.isInteger()) {
//                list.add(nestedInteger.getInteger());
//            } else {
//                nextListAdd(nestedInteger.getList());
//            }
//        }
//    }
//}
