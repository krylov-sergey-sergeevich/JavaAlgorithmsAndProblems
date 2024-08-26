package ru.code.workspace.base;

import ru.code.workspace.Problem;

/**
 * Дана строка символов.
 * Вычислить её длину.
 */
public class StringLengthProblem implements Problem {

    @Override
    public String run(String[] data) {
        return String.valueOf(data[0].length());
    }
}
