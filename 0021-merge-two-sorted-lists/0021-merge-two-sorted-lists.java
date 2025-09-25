/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
               List<Integer> values = new ArrayList<>();

        // Collect all values
        while (list1 != null) {
            values.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            values.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(values);

        // Build new linked list
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        for (int val : values) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        return dummy.next;
    }
}