import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
   public static void Ele_Reverse(int[] a , int st , int ed) {
            int temp = a[st];
                a[st]= a[ed];
                a[ed] = temp;

     
   }

   public static void swap(int[] a, int st, int end) {

     while(st<=end){
       Ele_Reverse(a,st,end);
      //  int temp = a[st];
      //  a[st]= a[end];
      //  a[end] = temp;
       st++;
       end--;
     }
     
  }
   

  public static void rotate(int[] a, int k){
    // write your code here
     int part1=0;
     int start_of_part2 = 0;
      start_of_part2= a.length - k;
     int end1 = 0;
      end1= a.length - 1;

      swap( a , start_of_part2 , end1 );
      swap( a , part1 , start_of_part2-1);
      swap( a, part1 , end1);

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