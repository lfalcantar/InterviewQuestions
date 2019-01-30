package com.lfalcantar.interviewquesitons.week1;
import java.math.BigInteger;

public class removeKdigits {

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

    /**Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

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
