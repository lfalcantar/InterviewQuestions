package com.lfalcantar.interviewquesitons.week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeating {

    /**
     * This solution is not correct as it will fail with the
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring_Wrong(String s) {
        int result = 0;
        if (s.length() == 0) { return result; }

        Set<Character> set = new HashSet<Character>();


        for (int i = 0; i < s.length(); i++){
            Character currentChar = new Character(s.charAt(i));
           if(set.contains(currentChar)){
               set.clear();
           }else{
               set.add(currentChar);
           }
            result = Math.max(result, set.size());
        }

        return  result;
    }

    //  N^2 solution
    public static int lengthOfLongestSubstringFix_N2(String s) {
        int result = 0;
        if (s.length() == 0) { return result; }

        Set<Character> set = new HashSet<Character>();

        for(int j = 0; j  < s.length(); j++) {
            for (int i = j; i < s.length(); i++) {
                Character currentChar = new Character(s.charAt(i));
                if (set.contains(currentChar)) {
                    set.clear();
                } else {
                    set.add(currentChar);
                }
                result = Math.max(result, set.size());
            }
        }

        return  result;
    }

    // N Solution
    public static int lengthOfLongestSubstringFix_N(String str) {
        int n = str.length();
        if (str == null || str.equals("") || n < 1) { return 0; }

        int currentLength = 1;    // length of current substring
        int maxLength = 1;    // result
        int prevIndex;     //  previous index

        /**
         *  in the array we stored the last known position of that character.
         *  in this case -i meaning not visited
         */
        int visited[] = new int[256];

        Arrays.fill(visited, -1);

        visited[str.charAt(0)] = 0;


        for(int i = 1; i < n; i++) {
            prevIndex = visited[str.charAt(i)];

            if(prevIndex == -1 || (i - currentLength) > prevIndex) {
                currentLength++;
            } else {
                if(currentLength > maxLength)
                    maxLength = currentLength;

                currentLength = i - prevIndex;
            }

            visited[str.charAt(i)] = i;
        }
        return Math.max(currentLength, maxLength);
    }
}
