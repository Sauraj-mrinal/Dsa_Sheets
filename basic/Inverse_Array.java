import java.io.*;
import java.util.*;

public class Inverse_Array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    int [] resultArr = new int[a.length];
    for(int index=0; index<a.length; index++){
        int temp= a[index];
       resultArr[temp]=index;
       
    }
    for(int i=0;i<a.length;i++){
      a[i]=resultArr[i];
    }
     return a;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}