
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
         int target = scn.nextInt();
         //int LastIndex = arr.length - 1;
       int index = lastIndex(arr, 0 , target);
        System.out.println(index);

    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int ans = lastIndex( arr, idx+1, x);
        if(ans == -1){
            if(arr[idx]== x ){
               return idx; 
            }
             
        }
        return ans;
        
    }  

}