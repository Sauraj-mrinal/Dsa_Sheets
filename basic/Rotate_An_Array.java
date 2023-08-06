//Rotate_An_Array
import java.io.*;
import java.util.*;

public class Rotate_An_Array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

   public static void swap(int[]a ,int lo, int hi) {
     int temp;
     temp = a[lo];
     a[lo]= a[hi];
     a[hi]=temp;
   }
   public static void reverse(int[] a, int lo, int hi) {
     
     // swap
     while(lo<=hi){
           
           swap(a,lo,hi);
    
             lo++;
              hi--;
     }
     
    
  }

  public static void rotate(int[] a, int k){
    // write your code here

    int n = a.length;
     k = k % n;
    if(k<0){
      k+=n;

    }
    reverse ( a, 0, n-k-1);
    reverse ( a, n-k, n-1);
    reverse ( a, 0, n-1);


  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}