package xyz.intellij.leecode.palindrome_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Classname Solution
 * @Description 回文问题String方案
 * @Date 2020/4/29 23:13
 * @Created by whp98
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String s = ""+x;
        ArrayList<Character> charsList = new ArrayList<Character>();
        char[] chars = s.toCharArray();
        Collections.addAll(charsList,chars);
        Collections.reverse(charsList);
        
        if ()
    }
}
