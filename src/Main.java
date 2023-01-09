
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, min, max = 0;
        System.out.println("Введите длину стороны матрицы: ");
        n = in.nextInt();
        System.out.println("Введите минимальное значение элемента: ");
        min = in.nextInt();
        System.out.println("Введите максимальное значение элемента: ");
        max = in.nextInt();

        int matrix[][] = fillMatrix(n, min, max);
        printMatrix(matrix);
        int mainDiagonal = solveMainDiagonalSum(matrix);
        System.out.println("Сумма главной диагонали равна "+ mainDiagonal);
        int matrixSum = solveGeneralSum(matrix);
        System.out.println("Сумма всех элементов равна "+ matrixSum);

    }

    private static int[][] fillMatrix(int n, int min, int max){
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = new Random().nextInt(min,max);
                arr[i][j] = num;
            }
        }
        return arr;
    }

    private static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.printf(" " + arr[i][j] + "* ");
                } else  {System.out.printf(" " + arr[i][j] + " ");}
            }
            System.out.println("");
        }
    }

    private static int solveMainDiagonalSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    private static int solveGeneralSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

}
