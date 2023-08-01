import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int nr = scn.nextInt();
    int nc = scn.nextInt();

    int arr[][] = new int[nr][nc];

    for(int index  =0; index<nr; index++){
        for(int index2 = 0; index2<nc;index2++){
            arr[index][index2] = scn.nextInt();
        }
    }

    for(int col =0; col<nc; col++){
        if(col==0 || col%2==0){
           for(int row1 =0;row1<nr;row1++){
                System.out.println(arr[row1][col]);
           }
        }else{
            for(int row=nr-1;row>=0;row--){
            System.out.println(arr[row][col]);
        }
        }
        
    }

 }

}