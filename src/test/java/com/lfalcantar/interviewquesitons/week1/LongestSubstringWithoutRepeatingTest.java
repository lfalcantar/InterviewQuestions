package com.lfalcantar.interviewquesitons.week1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;


@State(Scope.Thread)
public class LongestSubstringWithoutRepeatingTest {


    @DisplayName(" Test String :abcabcbb")
    @Test
    public void abcabcbbTest() {
        String str = "abcabcbb";
        int expectedResult = 3;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName(" Test String :bbbbb")
    @Test
    public void bbbbbTest() {
        String str = "bbbbb";
        int expectedResult = 1;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName(" Test String :pwwkew")
    @Test
    public void pwwkewTest() {
        String str = "pwwkew";
        int expectedResult = 3;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName(" Test String :\"\"")
    @Test

    public void emptyStringTest() {
        String str = "";
        int expectedResult = 0;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

    @DisplayName(" Test String :abcdbefg ")
    @Test

    public void abcdbefgTest() {
        String str = "abcdbefg";
        int expectedResult = 6;

        int result = LongestSubstringWithoutRepeating.lengthOfLongestSubstringFix_N(str);

        Assertions.assertEquals(result, expectedResult);
    }

}
