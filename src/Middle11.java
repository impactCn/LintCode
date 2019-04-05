///**
// * @program: LintCode中等
// * @description: 给定两个值 k1 和 k2（k1 < k2）和一个二叉查找树的根节点。
//                  找到树中所有值在 k1 到 k2 范围内的节点。
//                  即打印所有 x (k1 <= x <= k2)
//                  其中 x 是二叉查找树的中的节点值。返回所有升序的节点值。
// * @author: SY_zheng
// * @create: 2019-04-05
// */
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Stack;
//
///**
// * Definition of TreeNode:
// * public class TreeNode {
// *     public int val;
// *     public TreeNode left, right;
// *     public TreeNode(int val) {
// *         this.val = val;
// *         this.left = this.right = null;
// *     }
// * }
// */
//public class Middle11 {
//
//    /**
//     * @param root: param root: The root of the binary search tree
//     * @param k1: An integer
//     * @param k2: An integer
//     * @return: return: Return all keys that k1<=key<=k2 in ascending order
//     */
//    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
//        // write your code here
//        // 非递归前序遍历二叉树
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        List<Integer> list = new ArrayList<>();
//
//        // 判断是否空树
//        if (root == null) {
//            return list;
//        }
//
//        // 将树根节点压入栈
//        stack.push(root);
//        while (!stack.isEmpty()) {
//           // 指向当前节点
//            TreeNode cur = stack.pop();
//            // 当前节点值添加到结果链表中
//            list.add(cur.val);
//
//            if (cur.right != null) {
//                stack.push(cur.right);
//            }
//            if (cur.left != null) {
//                stack.push(cur.left);
//            }
//        }
//
//        // 存放搜索区间的的节点值
//        List<Integer> section = new ArrayList<>();
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            int next = iterator.next();
//            if (k1 <= next && k2 >= next) {
//                section.add(next);
//            }
//        }
//        return section;
//
//    }
//}
