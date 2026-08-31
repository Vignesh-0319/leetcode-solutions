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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int []ans = new int[2];
        ans[0]=Integer.MAX_VALUE;
        ans[1]=-1;
        int k = head.val;
        head=head.next;
        int min=-1;
        int max=Integer.MIN_VALUE;
        int i=0;
        while(head.next!=null){
            i++;
            if(k<head.val&&head.val>head.next.val||k>head.val&&head.val<head.next.val){
                if(max!=Integer.MIN_VALUE){
                ans[0]=Math.min(i-max,ans[0]);
                ans[1]=i-min;
                }
                if(min==-1) min=i;
                max=i;
            }
            k=head.val;
            head=head.next;
        }
        if(ans[0]==Integer.MAX_VALUE) ans[0]=-1;
    return ans;
    }
}