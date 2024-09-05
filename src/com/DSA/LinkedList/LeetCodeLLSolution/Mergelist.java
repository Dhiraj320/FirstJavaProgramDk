package com.DSA.LinkedList.LeetCodeLLSolution;

public class Mergelist {
    // Using MergeList
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return mergeTwoLists(left, right);

    }
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)   return list2;
        if(list2 == null)   return list1;

        // Create a dummy node to act as the head of the merged list
        ListNode head = new ListNode();
        ListNode temp = head;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        // Attach the remaining nodes from list1 or list2
        if(list1 != null) {
            temp.next = list1;
        }
        if(list2 != null) {
            temp.next = list2;
        }

        // Return the head of the merged list, which is dummy.next
        //as first node is initialised with val 0
        return head.next;
    }
}
