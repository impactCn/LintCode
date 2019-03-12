//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
///**
// * @program: LintCode
// * @description: 给出一棵二叉树,返回其中序遍历
// * @author: SY_zheng
// * @create: 2019-03-12
// */
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
//public class Simple67 {
//    /**
//     * @param root: A Tree
//     * @return: Inorder in ArrayList which contains node values.
//     */
//    public List<Integer> inorderTraversal(TreeNode root) {
//        // write your code here
//        // 非递归实现二叉树中序遍历
////        if (root == null) {
////            return null;
////        }
////        Stack<TreeNode> stack = new Stack<TreeNode>();
////        List<Integer> result = new ArrayList<>();
////        // 将所有节点放入栈中
////        while (root != null) {
////            stack.push(root);
////            root = root.left;
////        }
////
////        while (!stack.isEmpty()) {
////            // peek 查看栈顶对象而不移除它
////            // pop 查看栈顶对象并且移除它
////            // push 向stack中添加元素
////            TreeNode node = stack.peek();
////            result.add(node.val);
////
////            if (node.right == null) {
////                node = stack.pop();
////                while (!stack.isEmpty() && stack.peek().right == node)  {
////                    node = stack.pop();
////                }
////            } else {
////                node = node.right;
////                while (node != null) {
////                    stack.push(node);
////                    node = node.left;
////                }
////            }
////        }
////        return result;
//
//        List<Integer> result = new ArrayList<>();
//        traverse(root, result);
//        return result;
//    }
//
//
//    /**
//     * 递归实现二叉树中序遍历
//     * @param root
//     */
//    private void traverse(TreeNode root, List<Integer> result) {
//        if (root == null) {
//            return;
//        }
//        traverse(root.left, result);
//        result.add(root.val);
//        traverse(root.right, result);
//    }
//
//}