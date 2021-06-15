// Read a matrix from the console and check whether it is symmetric or not.

import java.util.Scanner;

class Mat {
    int size;
}

public class Matrix {
    public static void main(String[] args) {

        Mat matrix1 = new Mat();
        int isSymmetric = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the matrix : ");
        matrix1.size = sc.nextInt();

        int matrix[][] = new int[matrix1.size][matrix1.size];
        int transpose[][] = new int[matrix1.size][matrix1.size];

        System.out.println("Enter the elements of the first matrix : ");
        for (int i = 0; i < matrix1.size; i++) {
            for (int k = 0; k < matrix1.size; k++) {
                matrix[i][k] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix1.size; i++) {
            for (int k = 0; k < matrix1.size; k++) {
                transpose[i][k] = matrix[k][i];
            }
        }

        System.out.println("Elements of the matrix is : ");
        for (int i = 0; i < matrix1.size; i++) {
            for (int k = 0; k < matrix1.size; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix is : ");
        for (int i = 0; i < matrix1.size; i++) {
            for (int k = 0; k < matrix1.size; k++) {
                System.out.print(transpose[i][k] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix1.size; i++) {
            for (int k = 0; k < matrix1.size; k++) {
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
