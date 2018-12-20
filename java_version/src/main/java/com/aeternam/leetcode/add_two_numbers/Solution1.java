/**
 * Leetcode - add_two_numbers
 */
package com.aeternam.leetcode.add_two_numbers;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = new ListNode(0);
        ListNode p = r;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int sum = 0;
        int mark = 0;
        

        while( p1 !=null || p2 != null){

            if(p1 !=null){
                sum += p1.val;
                p1 = p1.next;                
            }
            if(p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            p.next = new ListNode(sum % 10);
            mark = sum / 10;
            p = p.next;
        }
        if(mark ==1){
            p.next = new ListNode(mark);
        }
        return r.next;
    }	
    

}
