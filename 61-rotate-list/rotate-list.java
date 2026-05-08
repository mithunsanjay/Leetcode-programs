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
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null){
            return head;
        }
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        temp.next=head;

        k = k % len;
        k=len-k;
        ListNode tail=head;
        for(int i=1;i<k;i++){
            tail=tail.next;
        }
       head=tail.next;
        tail.next=null; 
        return head;
    }
   
}