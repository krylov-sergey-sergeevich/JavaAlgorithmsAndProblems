package ru.code.workspace.problems.others.base.string;

import ru.code.workspace.problems.Problem;

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
