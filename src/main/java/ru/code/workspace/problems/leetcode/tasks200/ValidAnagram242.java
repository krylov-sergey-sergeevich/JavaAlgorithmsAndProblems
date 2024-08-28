package ru.code.workspace.problems.leetcode.tasks200;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 *
 * https://leetcode.com/problems/valid-anagram/description/
 */
public class ValidAnagram242 {

    public boolean isAnagram(String s, String t) {
        // Если длины строк не равны, они не могут быть анаграммами
        if (s.length() != t.length()) {
            return false;
        }

        // Создаем хэш-карты для подсчета символов
        Map<Character, Integer> countMapS = new HashMap<>();
        Map<Character, Integer> countMapT = new HashMap<>();

        // Заполняем хэш-карты подсчетом символов
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            countMapS.put(charS, countMapS.getOrDefault(charS, 0) + 1);
            countMapT.put(charT, countMapT.getOrDefault(charT, 0) + 1);
        }

        // Сравниваем хэш-карты
        return countMapS.equals(countMapT);
    }

}
