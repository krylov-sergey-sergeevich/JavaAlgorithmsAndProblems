package ru.code.workspace.problems.base.combinatorics;

import org.junit.jupiter.api.Test;
import ru.code.workspace.problems.ProblemFileTester;
import ru.code.workspace.problems.others.base.combinatorics.LuckyTickets;

public class LuckyTicketsTest {

    @Test
    public void test_lucky_tickets() {
        var problem = new LuckyTickets();
        ProblemFileTester.runTests(problem, "/problem/base/combinatorics");
    }


}
