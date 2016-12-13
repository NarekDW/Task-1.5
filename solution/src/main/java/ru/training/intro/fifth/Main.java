package ru.training.intro.fifth;

/**
 * Created by Narek on 13.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Matrix matrix = new Matrix();
        matrix.setSize(11);
        int[][] getMatrix = matrix.initialization();
        print(getMatrix);
    }

    private static void print(int[][] matrix){
        System.out.println("Матрица размерности "+matrix.length+"x"+matrix.length+" :\n");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
