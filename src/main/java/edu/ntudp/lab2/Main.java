package edu.ntudp.lab2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int height = matrix.getMaxHeight();
        int width = matrix.getMaxWidth();
        String text = """
                Hello. What do you want?
                0 - Create matrix: Automatically
                1 - Create matrix: Manually
                2 - Calculation of the geometric mean of matrix elements (last matrix)
                3 - Display matrix
                4 - Exit
                """;
        Scanner scanner;
        int val;
        do {
            System.out.print(text);
            scanner = new Scanner(System.in);
            try {
                val = scanner.nextInt();
                switch (val) {
                    case 0:
                        System.out.println("Matrix created!");
                        matrix.createMatrixAutomatically(width, height);
                        break;
                    case 1:
                        System.out.print("Please type width of matrix: ");
                        width = scanner.nextInt();
                        System.out.print("Please type height of matrix: ");
                        height = scanner.nextInt();
                        if (width > 20 || height > 20) {
                            System.out.println("Error: width or height of matrix must be less than 20.");
                        }
                        else {
                            matrix.createMatrix(width, height);
                        }
                        break;
                    case 2:
                        System.out.println("Calculation of the geometric mean of matrix elements.");
                        if (matrix.getMatrix() == null) {
                            System.out.println("Error: matrix is null. Generate it firstly.");
                        }
                        else {
                            System.out.println("Geometric mean of matrix elements = " + matrix.calculateGeometricMean());
                        }
                        break;
                    case 3:
                        if (matrix.getMatrix() == null) {
                            System.out.println("Error: matrix is null. Generate it firstly.");
                        }
                        else {
                            System.out.println("Matrix: \n" + Arrays.deepToString(matrix.getMatrix()));
                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Creating matrix...");
                        matrix.createMatrixAutomatically(width, height);
                }
            } catch (InputMismatchException e) {
                System.out.println("You must type integer value.");
            }
        } while (true);
    }
}