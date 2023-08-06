package JavaCodes.BasicJava;
// find duck number 
// find the first digit of number ? 

   



import java.util.Scanner;

public class Q33 {
    static int  Revers_of_no(int n){
        int rev=0;
        do{
            int r = n%10;
            rev =rev*10 +r;
            n=n/10;
        }while(n!=0);
        return rev;
    }
    static boolean Find_Duck_no(int n){
        int count=0;
          int i=1;
          int r = n%10;
          n = n/10;
          if(r==0){
            return false;
          }else{
            do{
                int r2= n%10;
                if(r2==0){
                    count++;
                }
                n=n/10;

            }while(n!=0);
          }
          return count>0;
    }

    // static int Count_dig_of_no(int n){
    //     int count=0;
    //     do{
    //         n=n/10;
    //         count++;
    //     }
    //     return count;
    // }
    // static boolean Find_Duck_no(int n,int size){
    //     int ct=0;
    //     int count=0;
    //     int temp=n;
    //     int firstDigit = Integer.parseInt(Integer.toString(n).substring(0, 1));
    //     if(firstDigit==0){
    //         return false;

    //     }else if(firstDigit!=0){

    //        while(temp>10){
    //          int r = temp%10;
    //          if(r==ct){
    //              count++;
    //          }
    //          temp=temp/10;

    //        }
    //        if(count>0){
    //         return true;
    //        }
    //        return false ;
    //     }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int reverse_n = Revers_of_no(n);
    //     int count_dig = Count_dig_of_no(n);
       boolean b= Find_Duck_no(reverse_n);
    //    if(b){
    //     System.out.println("yes");
       }

    }
}
