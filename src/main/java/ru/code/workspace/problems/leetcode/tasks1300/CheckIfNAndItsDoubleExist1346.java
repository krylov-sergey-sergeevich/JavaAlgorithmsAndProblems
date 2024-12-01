package ru.code.workspace.problems.leetcode.tasks1300;

import java.util.HashMap;
import java.util.Map;

/**
 * 1346. Check If N and Its Double Exist
 * https://leetcode.com/problems/check-if-n-and-its-double-exist
 */
public class CheckIfNAndItsDoubleExist1346 {

    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> storage = new HashMap<>();
        for (Integer el : arr) {
            storage.put(el, storage.getOrDefault(el, 0) + 1);
        }
        for (int el : arr) {
            if (storage.containsKey(el * 2) && ((el != el * 2) || (el == 0 && storage.get(el) > 1))) {
                return true;
            }
        }
        return false;
    }
}
