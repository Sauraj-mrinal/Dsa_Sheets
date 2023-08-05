import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner (System.in);
      int n = scn.nextInt();
      int a =0;
      int b= 0;
      int sum=1;
       System.out.println(0);
       System.out.println(1);
     for(int i=3; i<=n;i++){
      a=b;
      b=sum;
      sum=a+b;
      System.out.println(sum);
      
      
     }
   }
  }