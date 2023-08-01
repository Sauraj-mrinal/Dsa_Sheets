import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx =0; idx<n; idx++){
            arr[idx] = scn.nextInt();
        }
        int k = scn.nextInt();
        //
        int st = 0;
        int end = arr.length - 1;
        while(st<=end){
            int midd = (st + end)/2;
            if(arr[midd]< k){
                st = midd+1;
                if(midd+1 == end || end-1 == midd){
                     
                      System.out.println(arr[end]);
                      System.out.println(arr[midd]);
                }
            }else if(arr[midd]> k){
                end= midd -1;
                if(end == midd+1 || end-1 == midd){
                   
                     System.out.println(arr[end]);
                      System.out.println(arr[midd]);
                }
            }
            else{
                System.out.println(arr[midd]);
            }

        }

 }

}