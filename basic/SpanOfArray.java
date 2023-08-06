import java.io.*;
import java.util.*;

public class SpanOfArray{

public static void main(String[] args)  {
    // write your code here
     Scanner sc=new Scanner(System.in);
     int n = sc.nextInt();
     int max = 0;
     int min = 0;
     int arr[] = new int[n];
     for(int idx = 0;idx<n;idx++){
         //arr[idx]= scn.nextInt();
         arr[idx] = sc.nextInt();  
     }
         max=arr[0];
          min = arr[0];
     for(int i =0; i <arr.length; i++){
        //  int j=i+1;
         
         if(arr[i]>max){
             max = arr[i];
         }else if(arr[i]<min){
             min=arr[i];
         }
        //  j++;
        
     }
     
     System.out.println( max-min);
     System.out.println( min);
 }

}