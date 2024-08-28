package ru.code.workspace.problems.leetcode.tasks400;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 459. Repeated Substring Pattern
 * <p>
 * <a href="https://leetcode.com/problems/repeated-substring-pattern/">...</a>
 */
public class RepeatedSubstringPattern459 {

    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();

        // Пробегаем по всем возможным длинам подстроки
        for (int i = 1; i <= length / 2; i++) {
            // Проверяем, если длина строки делится на длину подстроки
            if (length % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();

                // Строим строку, повторяя подстроку нужное количество раз
                for (int j = 0; j < length / i; j++) {
                    repeated.append(substring);
                }

                // Проверяем, совпадает ли построенная строка с оригинальной
                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }

        // Если ни одна подстрока не подходит
        return false;
    }

    public static boolean repeatedSubstringPatternBest(String s) {
        String doubled = s + s;
        // Убираем первый и последний символ
        String modified = doubled.substring(1, doubled.length() - 1);
        // Проверяем, содержится ли s внутри этой строки
        return modified.contains(s);
    }

}
