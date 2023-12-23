import java.io.*;
import java.util.*;

public class Main {
     public static void display(int[][]  matrix){
        for(int i = 0; i <matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int matrix[][] = new int [n][n];


         // input 
        for(int i=0; i<matrix.length;i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j] = scn.nextInt();
           }
        }

        //tranpose of matric 
        for( int t=0; t<n;t++){
            for( int y=t; y<n; y++){
                int temp = matrix[t][y];
                matrix[t][y] = matrix[y][t];
                matrix[y][t] = temp;
            }
        }
        // now swap the column first to last
         // secont to second last 
         // and so on

         //now we have to do this work for each row then we need a for loop 
         int idx=0;
         for (  idx = 0; idx <n; idx++){
             int lc=0;
             int rc = matrix[idx]-1;
             while(lc<rc){
                 int temp = matrix[idx][lc];
                 matrix[idx][lc] = matrix[idx][rc];
                 matrix[idx][rc] = temp;

                 // update the column
                 lc++;
                 rc--;
             }
             //update row by idx++;
         }
         display(matrix);

   
 }
}

