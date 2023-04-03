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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1=l1;
        ListNode temp2=l2;
        Boolean carry=false;
        while(temp1.next!=null && temp2.next!=null){

                int sum=temp1.val+temp2.val;
            if(carry==true){
                sum++;
                carry=false;
            }
            if(sum>9){
                carry=true;
                sum=sum%10;
            }
            temp1.val=sum;
            temp1=temp1.next;
            temp2=temp2.next;


        } 
        int sum=temp1.val+temp2.val;
            if(carry){
                sum++;
                carry=false;
            }
            if(sum>9){
                carry=true;
                sum=sum%10;
            }
            temp1.val=sum;
        if(temp1.next==null && temp2.next!=null){
            temp1.next=temp2.next;
        }
        while(carry==true && temp1.next!=null){
            temp1=temp1.next;
            sum=temp1.val+1;
            carry=false;
            if(sum>9){
                carry=true;
                sum=sum%10;
            }
            temp1.val=sum;
        }
        if(carry==true){
            ListNode extra = new ListNode(1);
            temp1.next=extra;
        }
        
        // if(temp2.next!=null){
        //     temp1.next=temp2.next;
        // }
        return l1;
    }
}