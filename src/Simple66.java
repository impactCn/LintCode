///**
// * @program: LintCode
// * @description: 给出一棵二叉树，返回其节点值的前序遍历。
// * @author: SY_zheng
// * @create: 2019-03-08
// */
//
//import java.util.ArrayList;
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
//public class Simple66 {
//
//    /**
//     * @param root: A Tree
//     * @return: Preorder in ArrayList which contains node values.
//     */
//    public List<Integer> preorderTraversal(TreeNode root) {
//        // write your code here
//        // 非递归前序遍历二叉树
//        // 存放未处理的节点
////        Stack<TreeNode> stack = new Stack<TreeNode>();
////        // 存放遍历后的结果
////        List<Integer> list = new ArrayList<>();
////
////        // 判断是否空树
////        if (root == null) {
////            return list;
////        }
////        // 将树根节点压入栈
////        stack.push(root);
////        while (!stack.isEmpty()) {
////            // 指向当前节点
////            TreeNode cur = stack.pop();
////            // 当前节点值添加到结果链表中
////            list.add(cur.val);
////
////            /**
////             * 判断当前节点是否存在右子树，有则入栈
////             * 判断当前节点是否存在左子树，有则入栈
////             * 这里先push右子节点，再push左子节点，因为栈是先进后出的，左后进，先出，才能满足先序遍历
////             */
////            if (cur.right != null) {
////                stack.push(cur.right);
////            }
////            if (cur.left != null) {
////                stack.push(cur.left);
////            }
////        }
////        return list;
//
//        // 递归调用前序遍历二叉树
//        List<Integer> result = new ArrayList<Integer>();
//        traverse(root, result);
//        return result;
//
//    }
//
//    // 把root为根的preorder加入result里面
//    private void traverse(TreeNode root, List<Integer> result) {
//        if (root == null) {
//            return;
//        }
//        result.add(root.val);
//        traverse(root.left, result);
//        traverse(root.right, result);
//    }
//
//}