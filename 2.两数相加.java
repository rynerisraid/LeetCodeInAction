/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
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
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode(0);
        ListNode pHead = head;
        int flag = 0;
        int temp = 0;
        while(p!=null&&q!=null){
            
            temp = p.val + q.val + flag;
            if(temp>=10){
                temp=temp%10;
                flag=1;
            }else{
                flag=0;
            }
            pHead.next = new ListNode(temp);
            pHead = pHead.next;
            p = p.next;
            q = q.next;
        }

        while(p!=null){    
            temp = p.val + flag;
            if(temp>=10){
                temp=temp%10;
                flag=1;
            }else{
                flag=0;
            }
            pHead.next = new ListNode(temp);
            pHead = pHead.next;
            p = p.next;
        }

        while(q!=null){    
            temp = q.val + flag;
            if(temp>=10){
                temp=temp%10;
                flag=1;
            }else{
                flag=0;
            }
            pHead.next = new ListNode(temp);
            pHead = pHead.next;
            q = q.next;
        }
        if(flag==1){
            pHead.next = new ListNode(1);
        }



        return head.next;
    }
}
// @lc code=end

