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
            if (s.substring(idx).startsWith("CD")) {
                result += 400;
                idx +=2;
            } else
            if (s.substring(idx).startsWith("CM")) {
                result += 900;
                idx +=2;
            } else
            if (s.substring(idx).startsWith("XL")) {
                result += 40;
                idx +=2;
            } else
            if (s.substring(idx).startsWith("XC")) {
                result += 90;
                idx +=2;
            } else
            if (s.substring(idx).startsWith("IV")) {
                result += 4;
                idx +=2;
            } else
            if (s.substring(idx).startsWith("IX")) {
                result += 9;
                idx +=2;
            } else
            if (s.substring(idx).startsWith("M")) {
                result += 1000;
                idx +=1;
            } else
            if (s.substring(idx).startsWith("D")) {
                result += 500;
                idx +=1;
            } else
            if (s.substring(idx).startsWith("C")) {
                result += 100;
                idx +=1;
            } else
            if (s.substring(idx).startsWith("L")) {
                result += 50;
                idx +=1;
            } else
            if (s.substring(idx).startsWith("X")) {
                result += 10;
                idx +=1;
            } else
            if (s.substring(idx).startsWith("V")) {
                result += 5;
                idx +=1;
            } else
            if (s.substring(idx).startsWith("I")) {
                result += 1;
                idx +=1;
            }
        }
        return result;
    }

}
