package ru.code.workspace.tools;

public class ArrayTool {
    public static void printBooleanArray(boolean[][] array) {
        for (boolean[] row : array) {
            for (boolean value : row) {
                System.out.print(value ? "1 " : "0 ");
            }
            System.out.println(); // Перевод строки после каждой строки массива
        }
    }

    public static void printIntegerArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Перевод строки после каждой строки массива
        }
    }
}
