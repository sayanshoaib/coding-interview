package leetcode;

// https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoLists {
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if (list1 == null) {
             return list2;
         }

         if (list2 == null) {
             return list1;
         }

         var tempFromL1 = list1.val;
         var tempFromL2 = list2.val;

         if (tempFromL1 <= tempFromL2) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
         } else {
             list2.next =mergeTwoLists(list1, list2.next);
             return list2;
         }
    }
}
