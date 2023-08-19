import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int ans =0;
       int mul = 1;
        int num = n;
       while(num>0){
           int rem = num%b;
               num=num/b;
           ans =ans + (rem*mul);
             mul = mul * 10;
           //num=num/b;
       }
          return ans;
//    }
    //   while(n>0){
    //       int r = n%b;
    //            n=n/b;
    //       ans = ans + r*mul;
    //       mul = mul*10;
    //   }
    //   return ans;
  }
  }