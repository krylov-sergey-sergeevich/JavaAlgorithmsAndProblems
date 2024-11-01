package ru.code.workspace.problems.leetcode.tasks0;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 * <p>
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanInteger13 {

    public int romanToInt(String s) {
        var result = 0;
        var idx = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put(String.valueOf('I'), 1);
        map.put(String.valueOf('V'), 5);
        map.put(String.valueOf('X'), 10);
        map.put(String.valueOf('L'), 50);
        map.put(String.valueOf('C'), 100);
        map.put(String.valueOf('D'), 500);
        map.put(String.valueOf('M'), 1000);
        map.put("IV", 4);
        while(idx < s.length()) {
            if (s.substring(idx).startsWith("M")) {
                result += 1000;
                idx +=1;
            }
            if (s.substring(idx).startsWith("D")) {
                result += 500;
                idx +=1;
            }
            if (s.substring(idx).startsWith("C")) {
                result += 500;
                idx +=1;
            }
        }
        return result;
    }

}
