package edu.ntudp;

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
        do {
            System.out.print(text);
            Scanner scanner = new Scanner(System.in);
            try {
                int val = scanner.nextInt();
                switch (val) {
                    case 0:
                        System.out.println("Matrix created!");
                        matrix.createMatrixAutomatically(width, height);
                        break;
                    case 1:
                        String manuallyTextWidth = "Please type width of matrix: ";
                        System.out.print(manuallyTextWidth);
                        width = scanner.nextInt();
                        String manuallyTextHeight = "Please type height of matrix: ";
                        System.out.print(manuallyTextHeight);
                        height = scanner.nextInt();
                        if (width > 20 || height > 20) {
                            System.out.println("Error: width or height of matrix must be less than 20.");
                        }
                        else {
                            matrix.createMatrix(width, height);
                        }
                        break;
                    case 2:
                        String rozrahynokSerednKvadratMatrText = "Calculation of the geometric mean of matrix elements.";
                        System.out.println(rozrahynokSerednKvadratMatrText);
                        if (matrix.getMatrix() == null) {
                            System.out.println("Error: matrix is null. Generate it firstly.");
                        }
                        else {
                            double geometricMean = matrix.geometricMean();
                            System.out.println("Geometric mean of matrix elements = " + geometricMean);
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
                String exc = "You must type integer value.";
                System.out.println(exc);
            }
        } while (true);
    }
}