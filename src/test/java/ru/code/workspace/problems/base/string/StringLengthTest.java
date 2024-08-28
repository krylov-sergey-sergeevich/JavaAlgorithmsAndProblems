package ru.code.workspace.problems.base.string;

import lombok.val;
import org.junit.jupiter.api.Test;
import ru.code.workspace.problems.ProblemFileTester;
import ru.code.workspace.problems.others.base.string.StringLengthProblem;

public class StringLengthTest {

    @Test
    public void test_string_length() {
        val problem = new StringLengthProblem();
        ProblemFileTester.runTests(problem, "/problem/base/string");
    }
}
