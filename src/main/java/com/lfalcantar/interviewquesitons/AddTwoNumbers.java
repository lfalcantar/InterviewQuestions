package com.lfalcantar.interviewquesitons;

public class AddTwoNumbers {

    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode  sumResult  = null;
        ListNode result = null;
        int l1Val, l2Val;
        int extra = 0, sum;
        while(l1 != null || l2 != null) {

            l1Val = l1 != null ? l1.val : 0;
            l2Val = l2 != null ? l2.val : 0;

            sum = l1Val + l2Val + extra; // get total

            extra = sum > 9 ? 1 : 0; // get the tenth
            sum = sum % 10; // get only the units

            if(sumResult == null) {
                sumResult = new ListNode(sum);
                result = sumResult;
            }
            else{
                sumResult.next = new ListNode(sum);
                sumResult = sumResult.next;
            }

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        // [5] -> [5] == [0] - [1]
        if(extra != 0)
            sumResult.next = new ListNode(extra);

        return result;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
