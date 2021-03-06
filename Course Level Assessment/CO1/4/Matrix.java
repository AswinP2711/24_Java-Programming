// Read a matrix from the console and check whether it is symmetric or not.

import java.util.Scanner;

class Mat {
    int row;
    int col;
}

public class Matrix {
    public static void main(String[] args) {

        Mat matrix1 = new Mat();
        int isSymmetric = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of row : ");
        matrix1.row = sc.nextInt();

        System.out.println("Enter the Size of column : ");
        matrix1.col = sc.nextInt();

        if (matrix1.row != matrix1.col) {
            System.out.println("The matrix must be a square matrix!!!");
            System.exit(0);
        }

        int matrix[][] = new int[matrix1.row][matrix1.col];
        int transpose[][] = new int[matrix1.col][matrix1.row];

        System.out.println("Enter the elements of the matrix : ");
        for (int i = 0; i < matrix1.row; i++) {
            for (int k = 0; k < matrix1.col; k++) {
                matrix[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix1.row; i++) {
            for (int k = 0; k < matrix1.col; k++) {
                transpose[i][k] = matrix[k][i];
            }
        }

        System.out.println("Elements of the matrix is : ");
        for (int i = 0; i < matrix1.row; i++) {
            for (int k = 0; k < matrix1.col; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix is : ");
        for (int i = 0; i < matrix1.col; i++) {
            for (int k = 0; k < matrix1.row; k++) {
                System.out.print(transpose[i][k] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix1.row; i++) {
            for (int k = 0; k < matrix1.col; k++) {
                if (transpose[i][k] != matrix[i][k]) {
                    isSymmetric = 0;
                    break;
                }

            }
        }

        if (isSymmetric == 1) {
            System.out.println("The given matrix is Symmetric matrix");
        } else {
            System.out.println("The given matrix is not Symmetric matrix.");
        }
    }
}
