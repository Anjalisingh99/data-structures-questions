package com.javaPrac;

public class LongestCommonPrefix {
    public String longestCommomPrefix(String[] strings)
    {
        /**
        * This function computes longest common prefix
         * This takes a string array as input
         * we are using a variable "prefixlen" to keep track of prefix we computed
        */
        if(0 == strings.length)
        {
            return "";
        }
        for(int prefixlen = 0; prefixlen < strings[0].length();prefixlen++)
        {
            char toMatch = strings[0].charAt(prefixlen);
            for(int i = 1; i< strings.length; i++)
            {
                if(prefixlen >= strings[i].length() || strings[i].charAt(prefixlen) != toMatch)
                {
                    return strings[0].substring(0,prefixlen);
                }
            }
        }
        return strings[0];
    }
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] testcase1= {"flower","flow","flowinsite"};
        System.out.println("common prefix of testcase1 : "+ longestCommonPrefix.longestCommomPrefix(testcase1));


        String[] testcase2 = {"dog","cat","bird"};
        System.out.println("common prefix of testcase2 : "+ longestCommonPrefix.longestCommomPrefix(testcase2));


        String[] testcase3 = {"class","classes",""};
        System.out.println("common prefix of testcase3 : "+ longestCommonPrefix.longestCommomPrefix(testcase3));
    }
}
