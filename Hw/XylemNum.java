package Hw;
import java.util.Scanner;

public class XylemNum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
    
        int lastDigit = number % 10;
        int digits = (int)Math.log10(number); // number of digits - 1 
        int firstDigit = (int)(number / Math.pow(10, digits));
    
        return lastDigit + firstDigit;
    }
    static int SumOfAllDig(int x){
        int sum=0;
        do{
            int r =x%10;
            sum =sum+r;
            x=x/10;
        }while(x!=0);
        return sum;
    }
    public static void main(String[] args) {
        
  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
     int a = sumFirstAndLastDigit(n);
     int b = SumOfAllDig(n);
     int Midd_dig_sum = b-a;
     if(Midd_dig_sum==a){
        System.out.println("it is a Xylem number ::");
     }else{
        System.out.println("not xylem number");
     }
}
}