package ru.code.workspace.base;

import lombok.val;
import org.junit.jupiter.api.Test;
import ru.code.workspace.ProblemFileTester;

public class StringLengthTest {

    @Test
    public void test_string_length() {
        val problem = new StringLengthProblem();
        ProblemFileTester.runTests(problem, "/problem/base/string");
    }
}
