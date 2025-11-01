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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        while(head!=null && set.contains(head.val)){
            head=head.next;
        }

        ListNode node=head;
    
        while(node!=null &&  node.next!=null){
            if(set.contains(node.next.val)){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        return head;
    }
    public boolean hasElement(int[] arr, int x){
        for(int a: arr){
            if(a==x) return true;
        }
        return false;
    }
}