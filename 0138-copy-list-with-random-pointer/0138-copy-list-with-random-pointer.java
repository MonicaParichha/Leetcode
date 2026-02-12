/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node newHead=new Node(head.val);
        Node newTemp=newHead;
        Node temp=head.next;
        HashMap<Node,Node> map=new HashMap<>();
        map.put(head,newHead);
        while(temp!=null){
            newTemp=new Node(temp.val);
            map.put(temp,newTemp);
            temp=temp.next;
            newTemp=newTemp.next;
        }
        temp=head;
        while(temp!=null){
            Node newTemp1=map.get(temp);
            newTemp1.next=map.get(temp.next);
            newTemp1.random=map.get(temp.random);
            temp=temp.next;
            newTemp1=newTemp1.next;
        }
        return newHead;
    }
}