///**
// * @program: LintCode
// * @description: 给出一棵二叉树，返回其节点值的层次遍历（逐层从左往右访问）
// * @author: SY_zheng
// * @create: 2019-03-13
// */
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
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
//public class Simple69 {
//
//    /**
//     * @param root: A Tree
//     * @return: Level order a list of lists of integer
//     */
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        // write your code here
//
//        List result = new ArrayList();
//
//        if (root == null) {
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            List<Integer> level = new ArrayList<>();
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode head = queue.poll();
//                level.add(head.val);
//                if (head.left != null) {
//                    queue.offer(head.left);
//                }
//                if (head.right != null) {
//                    queue.offer(head.right);
//                }
//            }
//            result.add(level);
//        }
//        return result;
//    }
//}