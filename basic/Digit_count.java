import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int num= scn.nextInt();
      //  Scanner scn = new Scanner(System.in);
      //   int num = scn.nextInt();
    int n=num;
    int count=0;
     while(n>0){
       n=n/10;
       count++;
     }  
     System.out.println(count);
   }
  }