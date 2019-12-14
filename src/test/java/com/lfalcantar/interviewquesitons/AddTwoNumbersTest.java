package com.lfalcantar.interviewquesitons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

    private static AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUpClass() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @DisplayName(" Test String :(2 -> 4 -> 3) + (5 -> 6 -> 4)")
    @Test
    void firstTest() {
        //List one
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode list1Reference = listNode1;

        listNode1.next = new AddTwoNumbers.ListNode(4);
        listNode1 = listNode1.next;
        listNode1.next = new AddTwoNumbers.ListNode(3);

        //List two
        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode list2Reference = listNode2;

        listNode2.next = new AddTwoNumbers.ListNode(6);
        listNode2 = listNode2.next;
        listNode2.next = new AddTwoNumbers.ListNode(4);

        // Result list
        AddTwoNumbers.ListNode result = new AddTwoNumbers.ListNode(7);
        AddTwoNumbers.ListNode resultReference = result;

        result.next = new AddTwoNumbers.ListNode(0);
        result = result.next;
        result.next = new AddTwoNumbers.ListNode(8);

        AddTwoNumbers.ListNode expectedResult = addTwoNumbers.addTwoNumbers(list1Reference, list2Reference);

        while (expectedResult != null) {
            Assertions.assertEquals(expectedResult.val, resultReference.val);
            expectedResult = expectedResult.next;
            resultReference = resultReference.next;
        }
    }

    @DisplayName(" Test String :(5) + (5)")
    @Test
    void secondTest() {
        //List one
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode(5);

        //List two
        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode(5);

        // Result list
        AddTwoNumbers.ListNode result = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode resultReference = result;
        result.next = new AddTwoNumbers.ListNode(1);


        AddTwoNumbers.ListNode expectedResult = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

        while (expectedResult != null) {
            Assertions.assertEquals(expectedResult.val, resultReference.val);
            expectedResult = expectedResult.next;
            resultReference = resultReference.next;
        }
    }

    @DisplayName(" Test String :(2 -> 4) + (5 -> 6 -> 4)")
    @Test
    void thirdTest() {
        //List one
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode(2);
        listNode1.next = new AddTwoNumbers.ListNode(4);

        //List two
        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode list2Reference = listNode2;

        listNode2.next = new AddTwoNumbers.ListNode(6);
        listNode2 = listNode2.next;
        listNode2.next = new AddTwoNumbers.ListNode(4);

        // Result list
        AddTwoNumbers.ListNode result = new AddTwoNumbers.ListNode(7);
        AddTwoNumbers.ListNode resultReference = result;

        result.next = new AddTwoNumbers.ListNode(0);
        result = result.next;
        result.next = new AddTwoNumbers.ListNode(5);

        AddTwoNumbers.ListNode expectedResult = addTwoNumbers.addTwoNumbers(listNode1, list2Reference);

        while (expectedResult != null) {
            Assertions.assertEquals(expectedResult.val, resultReference.val);
            expectedResult = expectedResult.next;
            resultReference = resultReference.next;
        }
    }
}
