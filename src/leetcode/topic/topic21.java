package leetcode.topic;

import tool.coding.ListNode;

public class topic21 {
    public static void main(String[] args) {
        // 创建两个链表
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = mergeTwoLists(l1, l2);

        // 打印合并后的链表
        printList(result);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val < l2.val) {
            // 這裡表示下一個鎖鏈值
            l1.next = mergeTwoLists(l1.next, l2);
            // 返回 當前的鎖鏈值
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    // ✅ 打印链表
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }
}