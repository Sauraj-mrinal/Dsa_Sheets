import java.io.*;
import java.util.*;

public class Main{

    public static void input(int mat[][], Scanner scn){
       for(int p=0;p<mat.length;p++){
          for(int q=0; q<mat[0].length;q++){
              mat[p][q] = scn.nextInt();
          }
       }

    }
    public static void display(int mat[][]){
        for(int p=0;p<mat.length;p++){
          for(int q=0; q<mat[0].length;q++){
              System.out.print(mat[p][q]+ " ");
          }
          System.out.println();
       }

    }
    public static int [][]Mat_multiplay(int r1, int c1,int mat1[][] ,int r2, int c2, int mat2[][]){

        // decide the size of array
          int result_of_matric[][] = new int [r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0; k<r2;k++){
                  result_of_matric [i][j] = result_of_matric [i][j] +( mat1[i][k] * mat2[k][j]); 
                }
            }
        }

       
         
        return result_of_matric; 
    }

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int nr1 = scn.nextInt();
    int nc1 = scn.nextInt();
    // matric creation
    int matric1[][] = new int[nr1][nc1];

    // for input we will create input function 
    input(matric1, scn);
    // work for second matrice
    int nr2 = scn.nextInt();
    int nc2 = scn.nextInt();
    // matric creation
    int matric2[][] = new int[nr2][nc2];
     // for input we will create input function 
       input(matric2, scn);


    // matric multiplication
    if(nc1==nr2){
      int result[][]  = Mat_multiplay(nr1,nc1,matric1 ,nr2,nc2,matric2);
    display( result);
    }else{
        System.out.println("Invalid input");
    }
    




 }

}