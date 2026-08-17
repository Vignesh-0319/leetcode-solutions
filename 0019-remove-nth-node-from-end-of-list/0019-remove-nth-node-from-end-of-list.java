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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        int k = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            k++;
        }
        if(k==n) return head.next;
        temp = head;
        for(int i = 1; i<k-n; i++){
            temp=temp.next;
        }
        if(temp.next.next!=null){
            temp.next=temp.next.next;
        }
        else temp.next = null;
        return head;
    }
}