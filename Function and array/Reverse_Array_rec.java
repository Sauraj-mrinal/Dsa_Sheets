import java.io.*;
import java.util.*;

public class Reverse_Array_rec {

    public static void main(String[] args) {
        // write your code here
         Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i <n; i++){
            arr[i] = scn.nextInt();
        }
            int FullSize = arr.length;
            displayArrReverse(arr , FullSize-1);
        }
    

    public static void displayArrReverse(int[] arr, int idx) {
         
         if(idx == -1){
             return ;

         }
         System.out.println(arr[idx]);
         displayArrReverse(arr , idx-1);

    }
}

