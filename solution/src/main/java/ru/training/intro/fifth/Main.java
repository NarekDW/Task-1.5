package ru.training.intro.fifth;

import java.util.Scanner;
/**
 * Created by Narek on 13.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Matrix matrix = new Matrix();
        int size = getSize();
        matrix.setSize(size);
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

    private static int getSize(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер матрицы");
        int s = scan.nextInt();
        return s;
    }
}
