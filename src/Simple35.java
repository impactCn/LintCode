///**
// * Created by Administrator on 2019/2/11.
// */
//public class Simple35 {
//
//    public static void main(String[] args) {
//        Simple35 simple35 = new Simple35();
//        ListNode listNode = new ListNode(1);
//        System.out.println(simple35.reverse(listNode).val);
//    }
//
//
//    /**
//     * Definition for ListNode
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode(int x) {
//     *         val = x;
//     *         next = null;
//     *     }
//     * }
//     */
//
//    /**
//     * @param head: n
//     * @return: The new head of reversed linked list.
//     */
//    public ListNode reverse(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode prev = null;
//        ListNode current = head;
//        ListNode forward = current.next;
//        while(forward != null){
//            current.next = prev;
//            prev = current;
//            current = forward;
//            forward = forward.next;
//        }
//        current.next = prev;
//        return current;
//
//
//    }
//}
