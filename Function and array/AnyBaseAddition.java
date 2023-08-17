import java.util.*;
  
  public class AnyBaseAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
//    public static int getSum(int b, int n1, int n2){
//        // write ur code here
//        int carry=0;
//        int num1=n1;
//        int num2=n2;
//        int dig1 = num1%10;
//        int dig2 = num2%10;
//            dig1+dig2;

//    }

    public static int getSum(int b, int n1, int n2){
       // write ur code here
       int carry=0;
       int num1=n1;
       int num2=n2;
       int mul =1;
       int finalAns =0;
       while(num1>0 || num2 >0|| carry>0){
          int dig1 = num1%10;
          int dig2 = num2%10;

       int AnsNum = dig1+dig2 + carry;
           carry = AnsNum/b;
           int ans = AnsNum % b;
          finalAns = finalAns + (ans * mul);
        
       mul = mul*10;
        // System.out.print("________________________________");

         num1= num1/10;
         num2 = num2/10;
    }
        return finalAns;
       // System.out.print(finalAns);  

   }
  }
  