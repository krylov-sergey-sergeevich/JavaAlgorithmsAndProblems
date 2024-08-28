package ru.code.workspace.problems;

import lombok.experimental.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;


@UtilityClass
public class ProblemFileTester {

    public static void runTests(Problem problem, String path) {
        int exampleNumber = 0;
        try {
            while (true) {
                File inFile = buildFile(String.format("%s\\test.%d.in", path, exampleNumber));
                File outFile = buildFile(String.format("%s\\test.%d.out", path, exampleNumber));
                if (!inFile.exists() || !outFile.exists()) {
                    System.out.println("Files not found in: " + inFile.getAbsolutePath() + " | " + outFile.getAbsolutePath());
                    break;
                }
                System.out.printf("Test #%d - %b\n%n", exampleNumber, runTest(problem, inFile, outFile));
                exampleNumber++;
            }
        } catch (Exception ignored) {
        }
    }

    private static File buildFile(String path) throws URISyntaxException {
        return new File(ProblemFileTester.class.getResource(path).toURI());
    }

    private static boolean runTest(Problem problem, File inFile, File outFile) {
        try {
            String[] data = Files.readAllLines(Paths.get(inFile.getAbsolutePath())).toArray(new String[0]);
            String expect = Files.readString(Paths.get(outFile.getAbsolutePath())).trim();
            String actual = problem.run(data);
            return Objects.equals(actual, expect);
        } catch (IOException e) {
            System.err.printf(e.getMessage());
            return false;
        }
    }
}
