package edu.ntudp;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private static final int MAX_WIDTH = 20;
    private static final int MAX_HEIGHT = 20;
    private static final int MIN_RANGE = -100;
    private static final int MAX_RANGE = 100;
    private static final boolean DISABLE_ZERO_VALUE = true;
    private int[][] matrix = null;
    public int getMaxHeight() {
        return MAX_HEIGHT;
    }
    public int getMaxWidth() {
        return MAX_WIDTH;
    }
    public static int getMinRange() {
        return MIN_RANGE;
    }
    public static int getMaxRange() {
        return MAX_RANGE;
    }
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public int[][] getMatrix() {
        return matrix;
    }

    public int[][] createMatrixAutomatically(int width, int height) {
        int maxRange = getMaxRange();
        int minRange = getMinRange();
        Random random = new Random();
        int [][] matrix = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int rand = random.nextInt(maxRange - minRange) + minRange;
                if (DISABLE_ZERO_VALUE) {
                    while (rand == 0) {
                        rand = random.nextInt(maxRange - minRange) + minRange;
                    }
                }
                matrix[i][j] = rand;
            }
        }
        this.setMatrix(matrix);
        return matrix;
    }

    public Matrix() {

    }
    public int[][] createMatrix(int width, int height) {
        String text = "Type all elements of matrix:";
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        int [][] matrix = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                String elements = "matrix[" + (i+1) + "][" + (j+1) + "] = ";
                System.out.print(elements);
                try {
                    matrix[i][j] = scanner.nextInt();
                } catch (InputMismatchException e) {
                    String exception = "Error: you typed a non-integer value. Setting matrix[" + (i+1) + "][" + (j+1) + "] = 0 ...";
                    System.out.println(exception);
                    scanner.next(); // Clear the invalid input from the scanner
                    matrix[i][j] = 0;
                }
            }
        }
        this.setMatrix(matrix);
        return matrix;
    }

    public double geometricMean() {
        int [][] matrix = this.getMatrix();
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int totalCount = rowCount * colCount;

        double dobutok = 1.0;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                dobutok *= Math.abs(matrix[i][j]);
            }
        }
        return Math.pow(dobutok, 1.0 / totalCount);
    }
}
