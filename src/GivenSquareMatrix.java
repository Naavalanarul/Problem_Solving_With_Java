import java.util.*;
public class GivenSquareMatrix{

    static int traceMatrix(int[][] mat, int size){
        int sum = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == j){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    static void printMatrix(int[][] mat, int size){
        System.out.println("Matrix:");
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] getMatrix(int size, Scanner scanner){
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0 ; j < size; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] matrix = getMatrix(size, scanner);

        printMatrix(matrix, size);
        System.out.println("Trace of matrix = " + traceMatrix(matrix,size));

    }
}