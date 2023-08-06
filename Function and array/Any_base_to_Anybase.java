import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int decNumber = anyToDecimal(n,sourceBase);
     int reqAns= decTOAny_Base(decNumber,destBase);
         System.out.println(reqAns);
   }
    public static int anyToDecimal(int n,int sBase ){
      int ans=0;
      int mul=1;

      while(n>0){
         int r = n%10;
         ans = ans + r*mul;
         mul = mul*sBase;
         n=n/10;
      }
      return ans;
    }
    public static int decTOAny_Base (int n, int b) {
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
    }

  }