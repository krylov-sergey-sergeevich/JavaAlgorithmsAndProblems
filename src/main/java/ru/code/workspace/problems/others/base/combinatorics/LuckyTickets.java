package ru.code.workspace.problems.others.base.combinatorics;

import ru.code.workspace.problems.Problem;

/**
 * Счастливые билеты
 * <p>
 * Билет с 2N значным номером считается счастливым,
 * если сумма N первых цифр равна сумме последних N цифр.
 * Посчитать, сколько существует счастливых 2N-значных билетов.
 * <p>
 * Начальные данные: число N от 1 до 10.
 * Вывод результата: количество 2N-значных счастливых билетов.
 */
public class LuckyTickets implements Problem {

    private Long result;

    @Override
    public String run(String[] data) {
        result = 0L;
        int n = Integer.parseInt(data[0]);
        solve(n, 0, 0, 0);
        return result.toString();
    }

    public void solve(int n, int iter, int left, int right) {
        if (iter == n * 2) {
            if (left == right) {
                result++;
            }
        } else {
            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    solve(n, iter + 2, left + i, right + j);
                }
            }
        }
    }
}
