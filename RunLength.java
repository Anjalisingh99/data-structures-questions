/**
 * Problem Statement:Run length encoding compression offers a fast way to do efficient on the fly compression
   of strings.
 The idea is simple encode successive repeated characters by the repetition count ad the characters by the repetition
 count and the character */



package com.javaPrac;

public class RunLength {
    public String encoding(String toEncode)
    {
        int consecutiveCharCount = 1;
        StringBuilder encodedString = new StringBuilder();
        for(int currentChar = 1;currentChar <= toEncode.length(); ++currentChar)
        {
            if (currentChar == toEncode.length() || toEncode.charAt(currentChar) != toEncode.charAt(currentChar-1))
            {
                encodedString.append(consecutiveCharCount);
                encodedString.append(toEncode.charAt(currentChar-1));
                consecutiveCharCount = 1;
            }
            else
            {
                ++consecutiveCharCount;
            }

        }
        return encodedString.toString();
    }

    public static void main(String[] args) {
        RunLength runLength = new RunLength();
        String testcase1 = "Aaaaanbbbsss";
        System.out.println("Run Length encoding of testcase1 is "+testcase1+": "+runLength.encoding(testcase1));
    }
}
