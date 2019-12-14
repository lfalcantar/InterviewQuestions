package com.lfalcantar.interviewquesitons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingTest {


    @DisplayName(" Test String :abcabcbb")
    @Test
    void abcabcbbTest() {
        String str = "abcabcbb";
        int expectedResult = 3;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName(" Test String :bbbbb")
    @Test
    void bbbbbTest() {
        String str = "bbbbb";
        int expectedResult = 1;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName(" Test String :pwwkew")
    @Test
    void pwwkewTest() {
        String str = "pwwkew";
        int expectedResult = 3;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName(" Test String :\"\"")
    @Test
    void emptyStringTest() {
        String str = "";
        int expectedResult = 0;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName(" Test String :abcdbefg ")
    @Test
    void abcdbefgTest() {
        String str = "abcdbefg";
        int expectedResult = 6;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

}
