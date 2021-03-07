package cn.javon.dsa.a.leetcode.link.no83;

/**
 * @author qinjiangwei
 * @version 1.0
 * @description Definition for singly-linked list.
 * @date 2021/3/3
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(val + " -> ");
        if (next != null){
            builder.append(next.toString());
        }else {
            builder.append("null");
        }
        return builder.toString();
    }
}
