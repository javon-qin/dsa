package cn.javon.dsa.a.leetcode.link.no83;

/**
 * @author qinjiangwei
 * @version 1.0
 * @description 删除有序链表的重复元素
 * @date 2021/3/3
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(3, node2);
        ListNode node0 = new ListNode(2, node1);
        ListNode head = new ListNode(1, node0);

        System.out.println(solution.deleteDuplicates(head));

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode currentNode = head;
        while (currentNode != null){

            ListNode temp = currentNode.next;
            while (temp != null && currentNode.val == temp.val){
                currentNode.next = temp.next;
                temp = temp.next;
            }

            currentNode = currentNode.next;
        }

        return head;
    }

}
