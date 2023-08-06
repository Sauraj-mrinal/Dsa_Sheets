// WAJP to define a method to print the Armstrong number within N.
// YOU HAVE TO TACK N as a renge 
import java.util.Scanner;
class ArmstrongNumberTill_N{
    static int GetPow(int n, int p){
        int po_w=1;
        while(p!=0){
           po_w = po_w *n;
           p--;
        }
        return po_w;
    }
    static int CountDig(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
   static void CheckArmstrongNo(int x){
    int sum=0 ,t=x;
    int dc = CountDig(x);
    do{
        int r=x%10;
        sum = sum + GetPow(r,x);
        x = x/10;
        
    }while(x!=0);
    if(sum==t){
        System.out.println(t);
    }
}
  public static void main(String[] args) {
    
  
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the range");
    int reng = scn.nextInt();
    for(int i=1; i<=reng; i++){
         CheckArmstrongNo(i);
        
    }

   }
}