class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode temp = head;
        int n = 0;
  
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;

        while (n >= k) {
            ListNode curr = prevGroup.next;
            ListNode prev = null;

            for (int j = 0; j < k; j++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode first = prevGroup.next;
            prevGroup.next = prev;
            first.next = curr;
            prevGroup = first;

            n -= k;
        }

        return dummy.next;
    }
}
