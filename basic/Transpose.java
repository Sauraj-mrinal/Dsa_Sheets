import java.util.*;
public class Transpose {

  public static void swap(int first , int secnd)
  { 
    int Rmat[][] = new int
    int temp = first;
    first
  }

  public static void main(String[] args){
  Scanner scn = new Scanner(System.in);
  int row = scn.nextInt();
  int col = scn.nextInt();

  int matrix[][] = new int [row][col];
  for(int i=0; i<arr.length;i++){
    for (int j-0; j<arr[0].length; j++){
      matrix[i][j] = scn.nextInt();


    }

    //--------------------------
    for(int i=0; i<row ; i++){
      for (int j=0;j<=i; j++){
        swap(matrix [i][j], matrix [j][i]);
      }
    }
  }
  }

}