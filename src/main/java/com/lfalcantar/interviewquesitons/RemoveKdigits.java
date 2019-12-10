package com.lfalcantar.interviewquesitons;
import java.math.BigInteger;
import java.util.Stack;

public class RemoveKdigits {

    public String removeKdigits(String num, int k) {
        if(num == null || k >= num.length() || num.equals(""))
            return "0";
        return recursiveF(num,k);
    }

    /**
     * This solution is more than n2
        and it takes a long time to process the information
        not an optional solution
     */
    public String recursiveF(String num, int k) {
        if(k <= 0 ){
            return num;
        }

        BigInteger min  = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger returnValue;
        for(int i = 0; i < num.length();i++) {
            String resultSubstring = num.substring(0, i) + num.substring(i + 1);
            returnValue  = new BigInteger(recursiveF(resultSubstring, k - 1));
            min = min.min(returnValue);
        }

        return "" + min;
    }

    public String removeKdigits_N(String num, int k) {
        int len = num.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < len; i++){// 1. greedy method
            char c = num.charAt(i);
            while(!stack.isEmpty() && k > 0 && stack.peek() > c){
                stack.pop();
                k--;
            }
            if(c != '0' || !stack.isEmpty()){// 2. if we get to this point we dont want a  leading zero
                stack.push(c);
            }
        }
        while(k > 0 && !stack.isEmpty()){// 3. if k is greater than 0
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString().equals("") ? "0" : sb.toString();
    }

    /*Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

     Note:
     The length of num is less than 10002 and will be ≥ k.
     The given num does not contain any leading zero.
     Example 1:

     Input: num = "1432219", k = 3
     Output: "1219"
     Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
     Example 2:

     Input: num = "10200", k = 1
     Output: "200"
     Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
     Example 3:

     Input: num = "10", k = 2
     Output: "0"
     Explanation: Remove all the digits from the number and it is left with nothing which is 0.*/
}
