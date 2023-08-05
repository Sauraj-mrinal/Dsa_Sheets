import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
       int num = scn.nextInt();
       int n=num;
       int count=0;
       int t=1;
      while(n!=0){
        n = n/10;
        count++;
      }
      for(int i=0;i<count;i++){
        t=t*10;
      }
      t=t/10;
      while( t != 0){
        int ans = num/t;
        System.out.println(ans);
           num = num%t;
           t=t/10;
       

      }
     
     }
    }