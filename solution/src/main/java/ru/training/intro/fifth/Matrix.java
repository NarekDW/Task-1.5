package ru.training.intro.fifth;

/**
 * Created by Narek on 13.12.2016.
 */
class Matrix {
    private int size;
    private int[][] matrix;

    void set(int size){
        if(size>0){
            this.size=size;
        } else this.size=0;
    }

    int[][] initialization(){
        matrix = new int[size][size];
        int head=0;
        int tail=size-1;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(j == head || j == tail){
                    matrix[i][j]=1;
                } else{
                    matrix[i][j]=0;
                }
            }
            head++;
            tail--;
        }
        return matrix;
    }
}
